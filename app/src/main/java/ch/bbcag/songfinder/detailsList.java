package ch.bbcag.songfinder;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.jmusixmatch.entity.lyrics.Lyrics;

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
        String lyricsBody = getIntent().getExtras().getString("lyrics_body");
        String lyricsCopy = getIntent().getExtras().getString("lyrics_copyright");
        int lyricsId = getIntent().getExtras().getInt("lyrics_id");
        String lyricsLang = getIntent().getExtras().getString("lyrics_language");
        String pixel = getIntent().getExtras().getString("pixel_tracking_url");
        String script = getIntent().getExtras().getString("script_tracking_url");
       Lyrics lyrics =  makeLyrics(lyricsBody, lyricsCopy, lyricsId, lyricsLang, pixel, script);
      TrackObject currTrack=  makeTrack(trackId, trackName, artistName, lyrics);
        // String artistName = getTitle(trackId);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(artistName);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#32353A")));
    }

    public Lyrics makeLyrics(String lyricsBody, String lyricsCopy, int lyricsId, String lyricsLang, String pixel, String script) {
        Lyrics lyrics = new Lyrics();
        lyrics.setLyricsBody(lyricsBody);
        lyrics.setLyricsCopyright(lyricsCopy);
lyrics.setLyricsId(lyricsId);
lyrics.setLyricsLang(lyricsLang);
lyrics.setPixelTrackingURL(pixel);
lyrics.setScriptTrackingURL(script);
        return lyrics;
    }

    public TrackObject makeTrack(int trackId, String trackName, String artistName, Lyrics lyrics) {
        TrackObject currTrack = new TrackObject(trackId, trackName, artistName, lyrics, false);
        return currTrack;
    }


}
