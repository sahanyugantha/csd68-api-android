package com.sahan.csd68appone.dao;

import com.sahan.csd68appone.model.Game;

import java.util.ArrayList;
import java.util.List;

public class GamesDao {

    public List<Game> getFakeData(){
        List<Game> games = new ArrayList<>();
        Game game1 = new Game("Call of Duty", "Activsion", "https://pbs.twimg.com/profile_images/1412448565813604354/TQLICrjT_400x400.jpg", "https://cdn.akamai.steamstatic.com/steam/apps/393080/capsule_616x353.jpg?t=1501610448", "4.5");
        games.add(game1);
        Game game2 = new Game("PUBG", "Tencent Games", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/PUBG_Corporation_Logo.svg/2560px-PUBG_Corporation_Logo.svg.png", "https://www.notebookcheck.net/fileadmin/Notebooks/News/_nc3/PUBG_Mobile_header.jpg", "4.2");
        games.add(game2);
        Game game3 = new Game("Temple Run", "Imagine Studio", "https://i1.sndcdn.com/avatars-000184578272-i6zvi5-t500x500.jpg", "https://i.ytimg.com/vi/9aK2zoFBbKY/maxresdefault.jpg", "4.1");
        games.add(game3);

        return games;
    }
}
