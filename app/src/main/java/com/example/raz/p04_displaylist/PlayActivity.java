package com.example.raz.p04_displaylist;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    TextView song;
    TextView artist;

    // String artistName = getString(R.string.array_list_artist_name);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Disable portrait orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        // Set the content of the activity to use the activity_play.xml layout file
        setContentView(R.layout.activity_play);

        Intent click = getIntent();
        if (click == null)
            return;

        song = findViewById(R.id.text_view_play_song);
        song.setText(click.getStringExtra(TracklistActivity.EXTRA_SONG_NAME));

        artist = findViewById(R.id.text_view_play_artist);
        artist.setText(click.getStringExtra(TracklistActivity.EXTRA_ARTIST_NAME));

        // Find the View that shows the play button
        final ImageView playButton = findViewById(R.id.image_view_play_button);

        // Set a click listener on that View
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button is clicked on
            @Override
            public void onClick(View v) {
                playButton.setImageResource(R.drawable.ic_pause_black_48dp);
            }
        });

        // Find the View that shows the album button
        Button album = findViewById(R.id.button_album);

        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album button is clicked on
            @Override
            public void onClick(View v) {
                Activity currentActivity = (Activity) v.getContext();
                Intent i = new Intent(currentActivity, MainActivity.class);
                currentActivity.startActivity(i);
                overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            }
        });

        // Find the View that shows the trackList button
        Button trackList = findViewById(R.id.button_tracklist);

        // Set a click listener on that View
        trackList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the trackList button is clicked on
            @Override
            public void onClick(View v) {
                Activity currentActivity = (Activity) v.getContext();
                Intent i = new Intent(currentActivity, TracklistActivity.class);
                currentActivity.startActivity(i);
                overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            }
        });
    }
}
