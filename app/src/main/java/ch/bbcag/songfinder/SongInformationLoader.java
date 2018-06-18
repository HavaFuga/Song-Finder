package ch.bbcag.songfinder;

import android.os.AsyncTask;

import org.jmusixmatch.MusixMatchException;
import org.jmusixmatch.entity.track.Track;
import org.jmusixmatch.entity.track.TrackData;

public class SongInformationLoader extends AsyncTask<String, Integer, Track> {

    @Override
    protected Track doInBackground(String... strings) {
        String apiKey = "55615c98103f6c50e31c0904312eeafa";
        MusixMatch musixMatch = new MusixMatch(apiKey);

        Track track = null;

        try {
            track = (Track) musixMatch.(strings[0], "Eminem", "Lose yourself", 0, 0,true);
        } catch (MusixMatchException e) {
            e.printStackTrace();
        }
        return track;
    }

    @Override
    protected void onPostExecute(Track track) {
        TrackData data = track.getTrack();

        System.out.println("AlbumID : "    + data.getAlbumId());
        System.out.println("Album Name : " + data.getAlbumName());
        System.out.println("Artist ID : "  + data.getArtistId());
        System.out.println("Album Name : " + data.getArtistName());
        System.out.println("Track ID : "   + data.getTrackId());
    }
}
