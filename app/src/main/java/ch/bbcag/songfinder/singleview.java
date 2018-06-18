package ch.bbcag.songfinder;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

public class singleview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleview);
        ActionBar aBsingleView = getSupportActionBar();
        aBsingleView.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#32353A")));
       // aBsingleView.setTitle();
    }
}
