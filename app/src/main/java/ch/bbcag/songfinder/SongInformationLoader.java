package ch.bbcag.songfinder;

import android.os.AsyncTask;
import android.widget.ArrayAdapter;

import org.jmusixmatch.MusixMatchException;
import org.jmusixmatch.entity.lyrics.Lyrics;
import org.jmusixmatch.entity.track.Track;

import java.util.ArrayList;
import java.util.List;

import ch.bbcag.songfinder.model.TrackObject;


public class SongInformationLoader extends AsyncTask<String, Integer, List<Track>> {
    ArrayAdapter<TrackObject> arrayAdapter;
    String api = "55615c98103f6c50e31c0904312eeafa";
    MusixMatch mm = new MusixMatch(api);


    public SongInformationLoader(ArrayAdapter<TrackObject> arrayAdapter){
        this.arrayAdapter = arrayAdapter;
    }
    @Override
    public List<Track> doInBackground(String... strings) {
        String apiKey = "55615c98103f6c50e31c0904312eeafa";
        MusixMatch musixMatch = new MusixMatch(apiKey);
        ArrayList<TrackObject> foundTracks = new ArrayList<TrackObject>();

        List<Track> tracks = new ArrayList<>();

        try {
            tracks =  musixMatch.searchTracksByLyrics(strings[0], true);
        } catch (MusixMatchException e) {
            e.printStackTrace();
        }

        for (Track track : tracks) {
            int trackId = track.getTrack().getTrackId();
            String trackName = track.getTrack().getTrackName();
            String artistName = track.getTrack().getArtistName();

            Lyrics lyrics = null;
            try {
                lyrics = mm.getLyrics(trackId);
            } catch (MusixMatchException e) {
                e.printStackTrace();
            }
            TrackObject currentTrack = new TrackObject(trackId, trackName, artistName, lyrics);
            foundTracks.add(currentTrack);
        }

        return tracks;
    }

    @Override
    protected void onPostExecute(List<Track> foundTracks) {
        MusixMatch mm = new MusixMatch(api);

        arrayAdapter.add((TrackObject) foundTracks);
        arrayAdapter.notifyDataSetChanged();
    }
}
