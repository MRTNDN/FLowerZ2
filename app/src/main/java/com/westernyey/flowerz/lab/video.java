package com.westernyey.flowerz.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import android.widget.MediaController;
import android.widget.Button;
import android.content.Intent;

import com.westernyey.flowerz.R;

public class video extends AppCompatActivity {
    VideoView videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);

        videoPlayer = findViewById(R.id.videoPlayer);
        Uri myVideoUri = Uri.parse("android.resource://" +
                getPackageName() + "/" + R.raw.video);
        videoPlayer.setVideoURI(myVideoUri);

        MediaController mediaController = new MediaController(this);
        videoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoPlayer);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Возврат к предыдущей активности
            }
        });
    }

    public void play(View view) {
        videoPlayer.start();
    }

    public void pause(View view) {
        videoPlayer.pause();
    }

    public void stop(View view) {
        videoPlayer.stopPlayback();
        videoPlayer.seekTo(0); // Вернуть видео в начало
    }

}

