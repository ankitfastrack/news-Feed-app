package com.example.news_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class NewsDetail extends AppCompatActivity {

    ImageView details_img;
    TextView detail_title,detail_title_data,detail_published_at,detail_published_at_data,detail_author;
    TextView detail_author_data,detail_source,detail_source_data,detail_content,txtheading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        details_img=findViewById(R.id.details_img);
        detail_published_at=findViewById(R.id.detail_published_at);
        detail_published_at_data=findViewById(R.id.detail_published_at_data);
        detail_title=findViewById(R.id.detail_title);
        detail_title_data=findViewById(R.id.details_title_data);
        detail_author=findViewById(R.id.detail_author);
        detail_author_data=findViewById(R.id.detail_author_data);
        detail_source=findViewById(R.id.detail_source);
        detail_source_data=findViewById(R.id.detail_source_data);
        detail_content=findViewById(R.id.detail_content);
        txtheading=findViewById(R.id.txtheading);

        Intent intent = getIntent();
        String imgUrl = intent.getStringExtra("imgUrl");
        String Title=intent.getStringExtra("Title");
        String Published_At=intent.getStringExtra("published_at");
        String Author=intent.getStringExtra("author");
        String Source=intent.getStringExtra("Source");
        String content=intent.getStringExtra("content");

        Picasso.get().load(imgUrl).into(details_img);
        detail_title_data.setText(Title);
        detail_published_at_data.setText(Published_At);
        if(Author!=null)
        {
            detail_author_data.setText(Author);
        }
        else
        {
            detail_author_data.setText("AUTHOR NOT FOUND");
        }
        if(Source!=null)
        {
            detail_source_data.setText(Source);
        }
        else
        {
            detail_source_data.setText("AUTHOR NOT FOUND");
        }
        if(content!=null)
        detail_content.setText(content.toString());

    }
}
