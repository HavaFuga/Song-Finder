package ch.bbcag.songfinder.model;

import org.jmusixmatch.entity.lyrics.Lyrics;

public class TrackObject {
    int trackId;
    String trackName;
    String artistName;
    Lyrics trackLyrics;

    public TrackObject(int trackId, String trackName, String artistName, Lyrics trackLyrics){
        this.trackId = trackId;
        this.trackName = trackName;
        this.artistName = artistName;
        this.trackLyrics = trackLyrics;
    }

    /*@Override
    public String toString() {
        return name;
    }*/

    //Setter
    public void setId(int id) {
        this.trackId = id;
    }
    public void setName(String name) {
        this.trackName = name;
    }

    //Getter
    public int getId() {
        return trackId;
    }
    public String getName() {
        return trackName;
    }
}
