package ch.bbcag.songfinder;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class detailsFavorits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_favorits);
        
        String artistName;
        ActionBar actionBar = getSupportActionBar();
        //actionBar.setTitle(artistName);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#32353A")));
        //String artistName;
     //   ActionBar actionBar = getSupportActionBar();
       // actionBar.setTitle(artistName);
        //actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#32353A")));
    }
}
