package ch.bbcag.songfinder;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
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
        String someTrackLyrics = "Lose yourself";


        new SongInformationLoader().execute(someTrackLyrics);


    }
}
