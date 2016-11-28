package com.example.riabirthday;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class fourth extends AppCompatActivity {
    Button click;
    VideoView vid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        click = (Button) findViewById(R.id.button1);
        vid1 = (VideoView) findViewById(R.id.videoView1);

    }

    public void play(View v) {
        String videopath = "android.resource://com.example.riabirthday/" + R.raw.movie;
        Uri uri = Uri.parse(videopath);
        vid1.setVideoURI(uri);
        vid1.start();


    }

    public void next3(View view) {
        Intent intent = new Intent(this, fifth.class);
        startActivity(intent);

    }
}