package com.example.news_test;


import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

import java.security.Key;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class TopHeadline_API {

    private static final String Key="72ea6514d0c14b34bf7c9d8e71f44c96";
    private static final String url="https://newsapi.org/v2/";

    static TopHeadlineAPI headline=null;

    public static TopHeadlineAPI getService()
    {
        if(headline==null)
        {
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            headline=retrofit.create(TopHeadline_API.TopHeadlineAPI.class);
        }
        return headline;

    }

    public interface TopHeadlineAPI
    {
//        @GET("top-headlines?country=in&apiKey="+Key)
//        Call<TopHeadlines> get_top_headlines();
//
//        @GET("top-headlines?country=in&apiKey="+Key)
//        Call<TopHeadlines> get_top_headlines();
//
//        @GET("top-headlines?country=in&apiKey="+Key)
//        Call<TopHeadlines> get_top_headlines();




        @GET("top-headlines?country=in&apiKey="+Key)
        Call<TopHeadlines> getTopHeadlines();

        @GET("top-headlines?country=in&category=general&apiKey="+Key)
        Call<TopHeadlines> getGeneral();

        @GET("top-headlines?country=in&category=business&apiKey="+Key)
        Call<TopHeadlines> getBusiness();

        @GET("top-headlines?country=in&category=health&apiKey="+Key)
        Call<TopHeadlines> getHealth();

        @GET("top-headlines?country=in&category=technology&apiKey="+Key)
        Call<TopHeadlines> getTechnology();

        @GET("top-headlines?country=in&category=sports&apiKey="+Key)
        Call<TopHeadlines> getSports();

        @GET("top-headlines?country=in&category=science&apiKey="+Key)
        Call<TopHeadlines> getScience();

        @GET("top-headlines?country=in&category=entertainment&apiKey="+Key)
        Call<TopHeadlines> getEntertainment();

        @GET("top-headlines?country=in&q=corona&apiKey="+Key)
        Call<TopHeadlines> getCorona();

//        @GET("top-headlines?country=us&q=corona&apiKey="+Key)
//        Call<TopHeadlines> getSearch();


        @GET("top-headlines?country=in&{corona}&apiKey="+Key)
        Call<TopHeadlines> getSearch(@Path("corona") String corona);


//        @GET("search/multi?api_key="+AppConfig.TMDB_API_KEY)
//        Call<Search> search(@Query("query") String searchString);
//
//        @GET("movie/{movie_id}/reviews?api_key="+Key)
//        Call<TopHeadlines> getReviews(@Path("movie_id") String movieID);



    }

}
