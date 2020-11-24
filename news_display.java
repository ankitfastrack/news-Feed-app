package com.example.news_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class news_display extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Article> articleList;
    ListAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_display);
        String response = getIntent().getStringExtra("response");

        recyclerView = findViewById(R.id.recyclerview);
        articleList = new ArrayList<>();
        myAdapter = new ListAdapter(getApplicationContext(), articleList, new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemclick(int position) {
                Article article = articleList.get(position);
                Intent intent = new Intent(getApplicationContext(), NewsDetail.class);
                Bundle bundle = new Bundle();
                bundle.putString("imgUrl", article.getUrlToImage());
                bundle.putString("Title", article.getTitle());
                bundle.putString("published_at", article.getPublishedAt());
                bundle.putString("author", article.getAuthor());
                bundle.putString("Source", article.getSource().getName());
                bundle.putString("content", article.getContent());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        getApiResponse(response);


    }

    private void getApiResponse(String response) {

        switch (response)
        {
            case "general":
                Call<TopHeadlines> headlines = TopHeadline_API.getService().getGeneral();
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
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
                    }

                });
                break;

            case "health":
                headlines = TopHeadline_API.getService().getHealth();
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
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
                    }

                });
                break;

            case "technology":
                headlines = TopHeadline_API.getService().getTechnology();
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
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
                    }

                });
                break;

            case "sports":
                headlines = TopHeadline_API.getService().getSports();
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
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
                    }

                });
                break;

            case "corona":
                headlines = TopHeadline_API.getService().getCorona();
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
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
                    }

                });
                break;

            case "entertainment":
                headlines = TopHeadline_API.getService().getEntertainment();
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
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
                    }

                });
                break;

            case "busniess":
                headlines = TopHeadline_API.getService().getBusiness();
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
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
                    }

                });
                break;

            case "science":
                headlines = TopHeadline_API.getService().getScience();
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
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
                    }

                });
                break;
        }



    }
}
