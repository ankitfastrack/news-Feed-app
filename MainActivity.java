package com.example.news_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static String apiKey= "72ea6514d0c14b34bf7c9d8e71f44c96";
    EditText country_Id;
    Button get_news;
    private static final String Key="72ea6514d0c14b34bf7c9d8e71f44c96";
    private static final String url="https://newsapi.org/v2/top-headlines?";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);

//        country_Id=(EditText) findViewById(R.id.country_id);
//        get_news= findViewById(R.id.get_result);
//
//        get_news.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String country_code=country_Id.getText().toString();
//                Call<TopHeadlines> headlines= TopHeadline_API.getService().getTopHeadlines();
//                headlines.enqueue(new Callback<TopHeadlines>() {
//                    @Override
//                    public void onResponse(Call<TopHeadlines> call, Response<TopHeadlines> response) {
//                        TopHeadlines ob=response.body();
//                        String status =ob.getStatus();
//                        Integer no_of_news=ob.getTotalResults();
//                        List<Article> list=ob.getArticles();
//                        String title[]=new String[list.size()];
//                        String imgurl[]=new String[list.size()];
//                        String str=ob.getArticles().get(0).getUrl();
//                        for(int i=0;i<list.size();i++)
//                        {
//                            title[i]=list.get(i).getTitle();
//                            imgurl[i]=list.get(i).getUrlToImage();
//                        }
//                        Intent intent=new Intent(getApplicationContext(),news_display.class);
//                        intent.putExtra("title",title);
//                        intent.putExtra("ImgUrl",imgurl);
//                        intent.putExtra("status",status);
//                        intent.putExtra("no_of_news",no_of_news);
//                        startActivity(intent);
//                    }
//
//                    @Override
//                    public void onFailure(Call<TopHeadlines> call, Throwable t) {
//                        Toast.makeText(getApplicationContext(),"Something went wrong",Toast.LENGTH_LONG).show();
//
//                    }
//                });
//            }
//        });
    }
}
