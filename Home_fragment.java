package com.example.news_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home_fragment extends Fragment {

    RecyclerView listview;
    ListAdapter  myAdapter;
    List<Article> articleList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rcview = inflater.inflate(R.layout.fragment_home, container, false);
        listview = rcview.findViewById(R.id.Rrcview);
        articleList = new ArrayList<>();
        myAdapter =  new ListAdapter(getContext(), articleList,new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemclick(int position) {
                Article article = articleList.get(position);
                Intent intent=new Intent(getContext(),NewsDetail.class);
                Bundle bundle=new Bundle();
                bundle.putString("imgUrl",article.getUrlToImage());
                bundle.putString("Title",article.getTitle());
                bundle.putString("published_at",article.getPublishedAt());
                bundle.putString("author",article.getAuthor());
                bundle.putString("Source",article.getSource().getName());
                bundle.putString("content",article.getContent());
                intent.putExtras(bundle);
                startActivity(intent);
              //  Toast.makeText(getContext(),"recycler view on click called",Toast.LENGTH_LONG).show();
            }
        });
        listview.setAdapter(myAdapter);
        listview.setLayoutManager(new LinearLayoutManager(getContext()));

        egtRetrofitCall();

        return rcview;
    }

    private void egtRetrofitCall() {

        Call<TopHeadlines> headlines = TopHeadline_API.getService().getTopHeadlines();
        headlines.enqueue(new Callback<TopHeadlines>() {
            @Override
            public void onResponse(Call<TopHeadlines> call, Response<TopHeadlines> response) {
                TopHeadlines ob = response.body();
                String status = ob.getStatus();
                Integer no_of_news = ob.getTotalResults();
                List<Article> list = ob.getArticles();

               articleList.clear();
               articleList.addAll(list);
               myAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<TopHeadlines> call, Throwable t) {
                Toast.makeText(getContext(), "Something went wrong", Toast.LENGTH_LONG).show();
            }

        });
    }
}