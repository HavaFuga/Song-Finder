package ch.bbcag.songfinder;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class Favorits extends AppCompatActivity {

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Favoriten");
    }

    //MusixMatch
    String apiKey = "55615c98103f6c50e31c0904312eeafa";
    //MusixMatch musixMatch = new MusixMatch(apiKey); Fehler


}
