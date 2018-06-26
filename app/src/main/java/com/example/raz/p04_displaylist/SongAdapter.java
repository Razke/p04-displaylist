package com.example.raz.p04_displaylist;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID text_view_list_song
        TextView songListTextView = listItemView.findViewById(R.id.text_view_list_song);
        // Get the song name from the current Song object and
        // set this text on the name TextView
        songListTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID text_view_list_artist
        TextView defaultTextView = listItemView.findViewById(R.id.text_view_list_artist);
        // Get the artist name from the current Song object and
        // set this text on the name TextView
        defaultTextView.setText(currentSong.getArtistName());

        // Find the TextView in the list_item.xml layout with the ID text_view_list_song_length
        TextView theLengthOfSong = listItemView.findViewById(R.id.text_view_list_song_length);
        // Get the song length from the current Song object and
        // set this text on the number TextView
        theLengthOfSong.setText(currentSong.getSongLength());

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
