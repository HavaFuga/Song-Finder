package ch.bbcag.songfinder.model;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ch.bbcag.songfinder.R;

public class FavoritTrack extends AppCompatActivity {
    List<TrackObject> favorites = new ArrayList<TrackObject>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void addTrackToFavorites(TrackObject track){
        favorites.add(track);
        //Heart make red
    }

    public List<TrackObject> getFavorites() {
        return favorites;
    }

}
