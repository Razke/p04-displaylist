package com.example.raz.p04_displaylist;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Disable portrait orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the trackList button
        Button trackList = findViewById(R.id.button_artist);

        // Set a click listener on that View
        trackList.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the trackList button is clicked on
            @Override
            public void onClick(View v) {
                Activity currentActivity = (Activity) v.getContext();
                Intent i = new Intent(currentActivity, TracklistActivity.class);
                i.putExtra("anim id in", R.anim.up_in);
                i.putExtra("anim id out", R.anim.up_out);
                currentActivity.startActivity(i);
                overridePendingTransition(R.anim.down_in, R.anim.down_out);
            }
        });

        // Find the View that shows the album cover
        ImageView album = findViewById(R.id.image_view_album_cover);

        // Set a click listener on that View
        album.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the album cover is clicked on
            @Override
            public void onClick(View v) {
                Activity currentActivity = (Activity) v.getContext();
                Intent i = new Intent(currentActivity, TracklistActivity.class);
                i.putExtra("anim id in", R.anim.up_in);
                i.putExtra("anim id out", R.anim.up_out);
                currentActivity.startActivity(i);
                overridePendingTransition(R.anim.down_in, R.anim.down_out);
            }
        });
    }
}