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
        /*
        ListView listView_ft = findfViewById(R.id.favorit_tracks);

        ArrayAdapter<TrackObject> arrayAdapter = new ArrayAdapter<TrackObject>(
                this,
                android.R.layout.simple_list_item_1,
                trackObjects);

        lvSearch.setAdapter(arrayAdapter);

        // Assign adapter to ListView
        favorit_tracks.setAdapter( listAdapter );*/
    }
}
