package ch.bbcag.songfinder.model;

import java.util.List;

public class FavoritTrack {
    List<TrackObject> favorites = null;
    public void addTrackToFavorites(TrackObject track){
        favorites.add(track);
    }

    public List<TrackObject> getFavorites() {
        return favorites;
    }

    public void fillListView(List<TrackObject> favorites){
        /*ListView listView_ft = findfViewById(R.id.favorit_tracks);

        ArrayAdapter<String> listAdapter;
        listAdapter = new ArrayAdapter<TrackObject>(this, R.layout.activity_favorits, favorites);

        // Assign adapter to ListView
        favorit_tracks.setAdapter( listAdapter );*/
    }
}
