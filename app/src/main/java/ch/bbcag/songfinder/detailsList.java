package ch.bbcag.songfinder;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ch.bbcag.songfinder.model.TrackObject;

public class detailsList extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_list);

        listView = (ListView) findViewById(R.id.lv_search);
         adapter = (ArrayAdapter) listView.getAdapter();

        int trackId = getIntent().getExtras().getInt("trackId");
        String trackName = getIntent().getExtras().getString("trackName");
        String artistName = getIntent().getExtras().getString("artistName");
        String lyricsBody = getIntent().getExtras().getString("lyrics");
       // String artistName = getTitle(trackId);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(artistName);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#32353A")));
    }


    public TrackObject makeTrack(int trackId, String trackName,String artistName, String lyrics){
        TrackObject currTrack = new TrackObject(trackId,trackName,artistName,lyrics);
        return currTrack;
    }


}
