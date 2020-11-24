package com.example.news_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Category_fragment extends Fragment {

    RecyclerView listview;
    ListAdapter  myAdapter;
    List<Article> articleList;

    CardView general,health,technology,sports,corona,entertainment,busniess,science;
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view=inflater.inflate(R.layout.category_menu,container,false);
        general=view.findViewById(R.id.cd_view_category_general);
        health=view.findViewById(R.id.cd_view_health);
        technology=view.findViewById(R.id.cd_view_category_tech);
        sports=view.findViewById(R.id.cd_view_sports);
        corona=view.findViewById(R.id.cd_view_corona_update);
        entertainment=view.findViewById(R.id.cd_view_category_entertaiment);
        busniess=view.findViewById(R.id.cd_view_business);
        science=view.findViewById(R.id.cd_view_science);

        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent=new Intent(getContext(),news_display.class);
                intent.putExtra("response","general");
                startActivity(intent);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent=new Intent(getContext(),news_display.class);
                intent.putExtra("response","health");
                startActivity(intent);
            }
        });
        technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent=new Intent(getContext(),news_display.class);
                intent.putExtra("response","technology");
                startActivity(intent);
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent=new Intent(getContext(),news_display.class);
                intent.putExtra("response","sports");
                startActivity(intent);
            }
        });
        corona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent=new Intent(getContext(),news_display.class);
                intent.putExtra("response","corona");
                startActivity(intent);
            }
        });
        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent=new Intent(getContext(),news_display.class);
                intent.putExtra("response","entertainment");
                startActivity(intent);
            }
        });
        busniess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent=new Intent(getContext(),news_display.class);
                intent.putExtra("response","busniess");
                startActivity(intent);
            }
        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent intent=new Intent(getContext(),news_display.class);
                intent.putExtra("response","science");
                startActivity(intent);
            }
        });
        return view;
    }
}
