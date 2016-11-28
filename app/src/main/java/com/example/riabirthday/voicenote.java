package com.example.riabirthday;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class voicenote extends AppCompatActivity {
    MediaPlayer ourSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voicenote);


        ourSong=MediaPlayer.create(voicenote.this,R.raw.ria);
        ourSong.start();



    }
    public void next2(View view){
        Intent intent=new Intent(this,fourth.class);
        startActivity(intent);


    }


    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }
}
