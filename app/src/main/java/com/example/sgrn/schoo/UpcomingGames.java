package com.example.sgrn.schoo;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpcomingGames extends Fragment {


    public UpcomingGames() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upcoming_games, container, false);
    }


    public static MainActivity.MyFragment newInstance(String s, String s1) {
        return null;
    }
}
