package ch.bbcag.songfinder;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import org.jmusixmatch.MusixMatchException;

import java.util.ArrayList;
import java.util.List;

import ch.bbcag.songfinder.model.TrackObject;


public class ListActivity extends AppCompatActivity {
    String api = "55615c98103f6c50e31c0904312eeafa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ActionBar aBlist = getSupportActionBar();
        aBlist.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#32353A")));
        aBlist.setTitle("Vorschläge");
       // TextView tv = (TextView) findViewById(R.id.textView2);

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

    public void fill() throws MusixMatchException {
        String someTrackLyrics = "mom's spaghetti";
        List<TrackObject> trackObjects = new ArrayList<>();

        // MusixMatch mm = new MusixMatch(api);
        ListView lvSearch = findViewById(R.id.lv_search);
        ArrayAdapter<TrackObject> arrayAdapter = new ArrayAdapter<TrackObject>(this, android.R.layout.simple_list_item_1, trackObjects);
        SongInformationLoader sil = new SongInformationLoader(arrayAdapter);
        sil.execute(someTrackLyrics);
        lvSearch.setAdapter(arrayAdapter);

<<<<<<< HEAD
=======

        //Add to Favorites
        /*item heart = findViewById(R.id.heart_fav);
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FavoritTrack ft = new FavoritTrack();
                ft.addTrackToFavorites(getTrackID);
            }


        });*/

>>>>>>> 8b58b5418e480aba9d111616962c90d83ea3e328
    }


}



