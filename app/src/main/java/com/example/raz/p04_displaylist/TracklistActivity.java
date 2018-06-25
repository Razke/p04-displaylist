package com.example.raz.p04_displaylist;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class TracklistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(getString(R.string.array_list_artist_name), "Off the Grid", "5:05"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Believe (featuring Mario)", "3:43"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Tear the Roof Off (featuring Watsky)", "3:25"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Coolin' (featuring Dizzy Wright and Rob Curly)", "5:27"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Dopamine (featuring Thief)", "3:31"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Devil on My Shoulder", "4:40"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Birds in the Sky", "3:40"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Friend Like You (Lee Fields)", "3:55"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Blue", "4:01"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Great Escape", "4:00"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Whatever Happened to the DJ", "3:40"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Moments (featuring Gavin James)", "3:56"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Travelling Band", "1:25"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "1-800 Love Line (skit)", "3:53"));
        songs.add(new Song(getString(R.string.array_list_artist_name), "Soul Glo (featuring Lee Fields and Tabi Gazele)", "4:16"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);


        // Find the View that shows the album button
        Button album = findViewById(R.id.button_album);

        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album button is clicked on
            @Override
            public void onClick(View v) {
                Activity currentActivity = (Activity) v.getContext();
                Intent i = new Intent(currentActivity, MainActivity.class);
                i.putExtra("anim id in", R.anim.down_in);
                i.putExtra("anim id out", R.anim.down_out);
                currentActivity.startActivity(i);
                overridePendingTransition(R.anim.up_in, R.anim.up_out);
            }
        });
    }
}