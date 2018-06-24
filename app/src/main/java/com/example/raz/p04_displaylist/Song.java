package com.example.raz.p04_displaylist;

/**
 * {@link Song} represents a track that the user wants to see.
 * It contains the artist name and the length of the track.
 */
public class Song {

    /**
     * The artist's name
     */
    private String artistName;

    /**
     * The track's title
     */
    private String songName;

    /**
     * The track's length
     */
    private String songLength;

    /**
     * Create a new Song object.
     *
     * @param theNameOfArtist is the artist's name
     * @param theNameOfSong   is the track's title
     * @param theLengthOfSong is the track's length
     */
    public Song(String theNameOfArtist, String theNameOfSong, String theLengthOfSong) {
        artistName = theNameOfArtist;
        songName = theNameOfSong;
        songLength = theLengthOfSong;
    }

    /**
     * Get the artist's name.
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Get the track's title.
     */
    public String getSongName() {
        return songName;
    }

    /**
     * Get the track's length.
     */
    public String getSongLength() {
        return songLength;
    }
}