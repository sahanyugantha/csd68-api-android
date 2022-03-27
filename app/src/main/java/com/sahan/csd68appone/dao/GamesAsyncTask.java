package com.sahan.csd68appone.dao;

import android.os.AsyncTask;
import android.util.JsonReader;
import android.util.Log;

import com.sahan.csd68appone.config.EndPoints;
import com.sahan.csd68appone.model.Game;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GamesAsyncTask extends AsyncTask<Void,Void, List<Game>> {

    private static final String TAG = "customTag";

    @Override
    protected List<Game> doInBackground(Void... voids) {
        try {
            URL url = new URL(EndPoints.GAMES_API);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(1000*5);
            connection.setReadTimeout(1000*5);
            connection.setRequestMethod("GET");
            connection.setDoInput(true); //downloads
            connection.setDoOutput(false); //

            if (connection.getResponseCode() == 200){
                InputStream inputStream = connection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(inputStreamReader);

                String line = "";
                StringBuilder sb = new StringBuilder();

                while ((line = reader.readLine()) != null){
                    sb.append(line);
                }

                JSONArray arr = new JSONArray(sb.toString());
                List<Game> gameList = new ArrayList<>();
                for (int i = 0; i < arr.length(); i++) {
                    JSONObject obj = arr.getJSONObject(i);

                    Game game = new Game();
                    game.setName(obj.getString("name"));
                    game.setCompany(obj.getString("company"));
                    game.setOverallRate(obj.getString("rating"));
                    game.setImgURL(obj.getString("cover_url"));
                    game.setGameLogoURL(obj.getString("logo_url"));

                    gameList.add(game);
                }
                return gameList;
            }

        } catch (IOException | JSONException e){
            Log.i(TAG, "ERROR : "+e.getMessage());
            e.printStackTrace();
        }

        return null;
    }
}
