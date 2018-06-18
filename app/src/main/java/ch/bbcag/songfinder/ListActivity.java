package ch.bbcag.songfinder;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.jmusixmatch.MusixMatchException;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ActionBar aBlist = getSupportActionBar();
        aBlist.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#32353A")));
        aBlist.setTitle("Vorschläge");
        TextView tv = (TextView) findViewById(R.id.textView2);
        try {
            this.fill();
        } catch (MusixMatchException e) {
            e.printStackTrace();
        }
    }
    public void fill() throws MusixMatchException {
        String someTrackLyrics = "Lose yourself";


        new SongInformationLoader().execute(someTrackLyrics);


    }
}
