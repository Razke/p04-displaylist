package com.example.raz.p04_displaylist;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Disable portrait orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the trackList button
        Button trackList = findViewById(R.id.button_tracklist);

        // Set a click listener on that View
        trackList.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the trackList button is clicked on
            @Override
            public void onClick(View v) {
                Activity currentActivity = (Activity) v.getContext();
                Intent i = new Intent(currentActivity, TracklistActivity.class);
                currentActivity.startActivity(i);
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            }
        });

        // Find the View that shows the play button
        Button play = findViewById(R.id.button_play);

        // Set a click listener on that View
        play.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the play button is clicked on
            @Override
            public void onClick(View v) {
                Activity currentActivity = (Activity) v.getContext();
                Intent i = new Intent(currentActivity, PlayActivity.class);
                currentActivity.startActivity(i);
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
                Toast.makeText(getApplicationContext(), R.string.activity_play_error, Toast.LENGTH_LONG).show();
            }
        });
    }
}