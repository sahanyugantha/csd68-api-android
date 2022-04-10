package com.sahan.csd68appone.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sahan.csd68appone.R;
import com.sahan.csd68appone.adapter.GamesRecyclerViewAdapter;
import com.sahan.csd68appone.dao.GamesAsyncTask;
import com.sahan.csd68appone.dao.GamesDao;
import com.sahan.csd68appone.model.Game;

import java.util.ArrayList;
import java.util.List;


public class GamesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_games, container, false);

        RecyclerView recyclerView = fragmentView.findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        DividerItemDecoration divder = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(divder);

        GamesDao gamesDao = new GamesDao();
//        List<Game> games = new ArrayList<>();
//        try {
//            GamesAsyncTask gamesAsyncTask = new GamesAsyncTask();
//            games = gamesAsyncTask.execute().get();
//        } catch (Exception e){
//            e.printStackTrace();
//        }

        List<Game> games = gamesDao.getFakeData();
        GamesRecyclerViewAdapter adapter = new GamesRecyclerViewAdapter(getContext(), games);
        recyclerView.setAdapter(adapter);

        return fragmentView;
    }
}