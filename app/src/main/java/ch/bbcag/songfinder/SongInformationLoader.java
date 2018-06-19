package ch.bbcag.songfinder;

import android.os.AsyncTask;

import org.jmusixmatch.MusixMatchException;
import org.jmusixmatch.entity.track.Track;

import java.util.List;

public class SongInformationLoader extends AsyncTask<String, Integer, List<Track>> {

    @Override
    public List<Track> doInBackground(String... strings) {
        String apiKey = "55615c98103f6c50e31c0904312eeafa";
        MusixMatch musixMatch = new MusixMatch(apiKey);

        List<Track> tracks = null;

        try {
            tracks = (List<Track>) musixMatch.searchTracksByLyrics(strings[0], true);
        } catch (MusixMatchException e) {
            e.printStackTrace();
        }
        return tracks;
    }

    @Override
    protected void onPostExecute(List<Track> track) {
        // TrackData data = track.getTrack();

        // System.out.println("AlbumID : "    + data.getAlbumId());
        //System.out.println("Album Name : " + data.getAlbumName());
        // System.out.println("Artist ID : "  + data.getArtistId());
        // System.out.println("Album Name : " + data.getArtistName());
        //System.out.println("Track ID : "   + data.getTrackId());
    }
}
