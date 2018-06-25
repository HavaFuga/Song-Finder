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

    @Override
    public String toString() {
        return "TrackObject{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", trackLyrics=" + trackLyrics +
                '}';
    }
}


