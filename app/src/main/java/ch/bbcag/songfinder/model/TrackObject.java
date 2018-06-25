package ch.bbcag.songfinder.model;

import org.jmusixmatch.entity.lyrics.Lyrics;

public class TrackObject {
    int trackId;
    String trackName;
    String artistName;
    Lyrics trackLyrics;
    Boolean isFavorit;

    public TrackObject(int trackId, String trackName, String artistName, Lyrics trackLyrics, Boolean isFavorit){
        this.trackId = trackId;
        this.trackName = trackName;
        this.artistName = artistName;
        this.trackLyrics = trackLyrics;
        this.isFavorit = isFavorit;
    }



    @Override
    public String toString() {
        return this.trackName + "\n" + this.artistName;
    }


    public int getTrackId(){
        return this.trackId;
    }
    public String getTrackName(){
        return this.trackName;
    }
    public String getArtistName(){
        return this.artistName;
    }
    public Lyrics getTrackLyrics(){
        return this.trackLyrics;
    }
    public Boolean getFavorit() { return isFavorit; }
}


