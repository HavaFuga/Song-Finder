package ch.bbcag.songfinder;

import org.json.JSONException;
import org.json.JSONObject;

import ch.bbcag.songfinder.model.Track;

public class JsonTrack {

    public static Track createTrackFromJsonString(String trackJsonString) throws
            JSONException {
        JSONObject jsonObj = new JSONObject(trackJsonString);

        int trackId = Integer.parseInt(jsonObj.getString("trackId"));
        String trackName = jsonObj.getString("trackName");
        String artistName = jsonObj.getString("artistName");
        String trackLyrics = jsonObj.getString("trackLyrics");
        Track tracky = new Track(trackId, trackName, artistName, trackLyrics);
        return tracky;
    }

}

//        JSONObject jsonObj = new JSONObject(trackJsonString);
//        Track track = new Track(Integer.parseInt(jsonObj.getString("trackId")),
//       jsonObj.getString("trackName"),
//        jsonObj.getString("artistName"),
//       jsonObj.getString("trackLyrics") );
//   }




