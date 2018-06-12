package ch.bbcag.songfinder;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#32353A")));
        actionBar.setIcon(@drawable/herz_weiss.svg);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
       // getSupportActionBar().setIcon(res.drawable.herz_weiss.svg);
    }

}
