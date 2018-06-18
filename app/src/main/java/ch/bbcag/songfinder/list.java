package ch.bbcag.songfinder;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ActionBar aBlist = getSupportActionBar();
        aBlist.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#32353A")));
        aBlist.setTitle("Vorschläge");
    }
}
