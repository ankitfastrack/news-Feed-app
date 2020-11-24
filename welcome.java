package com.example.news_test;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        VideoView video_play;
        video_play=findViewById(R.id.video_play);
        String videoPath="android.resource://"+getPackageName()+"/"+ R.raw.welcome_screen;
        Uri uri=Uri.parse(videoPath);
        video_play.setVideoURI(uri);
        video_play.start();
    }
}
