package ch.bbcag.songfinder.model;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import ch.bbcag.songfinder.R;

public class FavoritTrack {
    List<Track> favorites = null;
    public void addTrackToFavorites(Track track){
        favorites.add(track);
    }

    public List<Track> getFavorites() {
        return favorites;
    }

    public void fillListView(List<Track> favorites){
        ListView favorit_tracks = findfViewById(R.id.favorit_tracks);

        ArrayAdapter<String> listAdapter;
        listAdapter = new ArrayAdapter<Track>(this, R.layout.activity_favorits, favorites);

        // Assign adapter to ListView
        favorit_tracks.setAdapter( listAdapter );
    }
}
