package ch.bbcag.songfinder;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ch.bbcag.songfinder.R;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final List<String> names;
    private final List<String> artists;

    public CustomListAdapter(Activity context, List<String> names, List<String> artists) {
        super(context, R.layout.mylist, artists);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.names=names;
        this.artists=artists;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(names.get(position));
        imageView.setImageResource(R.drawable.heart_white);
        extratxt.setText(artists.get(position));
        return rowView;

    };
}