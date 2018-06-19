/*package ch.bbcag.songfinder.model;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import ch.bbcag.songfinder.R;

public class FavoritTrack {
    List<TrackObject> favorites = null;
    public void addTrackToFavorites(TrackObject track){
        favorites.add(track);
    }

    public List<TrackObject> getFavorites() {
        return favorites;
    }

    public void fillListView(List<TrackObject> favorites){
        ListView favorit_tracks = findViewById(R.id.favorit_tracks);

        ArrayAdapter<TrackObject> listAdapter;
        listAdapter = new ArrayAdapter<FavoritTrack>(this, R.layout.activity_favorits, favorites);

        // Assign adapter to ListView
        favorit_tracks.setAdapter( listAdapter );
    }
}*/
