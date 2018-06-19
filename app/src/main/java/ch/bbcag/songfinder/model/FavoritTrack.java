import java.util.List;

import ch.bbcag.songfinder.model.TrackObject;

///*package ch.bbcag.songfinder.model;
//
//import java.util.List;
//
//public class FavoritTrack {
//    List<TrackObject> favorites = null;
//    public void addTrackToFavorites(TrackObject track){
//        favorites.add(track);
//    }
//
//    public List<TrackObject> getFavorites() {
//        return favorites;
//    }
//
//    public void fillListView(List<TrackObject> favorites){

//        ListView favorit_tracks = findViewById(R.id.favorit_tracks);
//
//        ArrayAdapter<TrackObject> listAdapter;
//        listAdapter = new ArrayAdapter<FavoritTrack>(this, R.layout.activity_favorits, favorites);

//        /*
//        ListView listView_ft = findfViewById(R.id.favorit_tracks);
//
//        ArrayAdapter<TrackObject> arrayAdapter = new ArrayAdapter<TrackObject>(
//                this,
//                android.R.layout.simple_list_item_1,
//                trackObjects);
//
//        lvSearch.setAdapter(arrayAdapter);

//
//        // Assign adapter to ListView
//        favorit_tracks.setAdapter( listAdapter );*/
//    }
//}*/

        package ch.bbcag.songfinder.model;

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
