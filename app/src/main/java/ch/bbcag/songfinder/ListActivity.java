package ch.bbcag.songfinder;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import org.jmusixmatch.MusixMatchException;

import java.util.ArrayList;
import java.util.List;

import ch.bbcag.songfinder.model.TrackObject;


public class ListActivity extends AppCompatActivity {
    String api = "55615c98103f6c50e31c0904312eeafa";
    List<String> names = new ArrayList<String>();
    List<String> artists = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorits);
        ActionBar aBlist = getSupportActionBar();
        aBlist.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#32353A")));
        aBlist.setTitle("Vorschläge");
       // TextView tv = (TextView) findViewById(R.id.textView2);



        /*List<TrackObject> foundTracks = getInfos();
        //GEt names
        for (TrackObject track : foundTracks){
            String name = track.getTrackName();
            String artist = track.getArtistName();

            this.names.add(name);
            this.artists.add(artist);
        }*/

        ListView list;
        CustomListAdapter adapter=new CustomListAdapter(this, names, artists);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        try {
            this.fill();
        } catch (MusixMatchException e) {
            e.printStackTrace();
        }

        //Icon in ActionBar
        aBlist.setDisplayOptions(aBlist.getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        ImageView imageView = new ImageView(aBlist.getThemedContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.heart_white);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT, Gravity.RIGHT
                | Gravity.CENTER_VERTICAL);
        layoutParams.rightMargin = 40;
        imageView.setLayoutParams(layoutParams);
        aBlist.setCustomView(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListActivity.this, Favorits.class));
            }
        });

    }

    public List<TrackObject> getInfos(){
        List<TrackObject> trackObjects = new ArrayList<>();
        String someTrackLyrics = "mom's spaghetti";
        ArrayAdapter<TrackObject> arrayAdapter = new ArrayAdapter<TrackObject>(this, android.R.layout.simple_list_item_1, trackObjects);
        SongInformationLoader sil = new SongInformationLoader(arrayAdapter);
        List<TrackObject> foundTracks = (List<TrackObject>) sil.execute(someTrackLyrics);
        return foundTracks;
    }
    public void fill() throws MusixMatchException {
        String someTrackLyrics = "mom's spaghetti";
        List<TrackObject> trackObjects = new ArrayList<>();

        // MusixMatch mm = new MusixMatch(api);
        ListView lvSearch = findViewById(R.id.lv_search);
        ArrayAdapter<TrackObject> arrayAdapter = new ArrayAdapter<TrackObject>(this, android.R.layout.simple_list_item_1, trackObjects);
        SongInformationLoader sil = new SongInformationLoader(arrayAdapter);
        List<TrackObject> foundTracks = (List<TrackObject>) sil.execute(someTrackLyrics);
        lvSearch.setAdapter(arrayAdapter);


        AdapterView.OnItemClickListener mListClickedHandler = new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), detailsList.class);
                TrackObject selected = (TrackObject)parent.getItemAtPosition(position);
                intent.putExtra("trackId", selected.getTrackId());
                intent.putExtra("trackName", selected.getTrackName());
                intent.putExtra("artistName", selected.getArtistName());
                intent.putExtra("lyrics_body", selected.getTrackLyrics().getLyricsBody());
                intent.putExtra("lyrics_copyright", selected.getTrackLyrics().getLyricsCopyright());
                intent.putExtra("lyrics_id", selected.getTrackLyrics().getLyricsId());
                intent.putExtra("lyrics_language", selected.getTrackLyrics().getLyricsLang());
                intent.putExtra("pixel_tracking_url", selected.getTrackLyrics().getPixelTrackingURL());
                intent.putExtra("script_tracking_url", selected.getTrackLyrics().getScriptTrackingURL());
          //      intent.putExtra("trackName", selected.getTrackName());
          //      intent.putExtra("artistName", selected.getArtistName());

                startActivity(intent);
            }
        };
        lvSearch.setOnItemClickListener(mListClickedHandler);



        //Add to Favorites
        /*item heart = findViewById(R.id.heart_fav);
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FavoritTrack ft = new FavoritTrack();
                ft.addTrackToFavorites(getTrackID);
            }


        });*/


    }


}



