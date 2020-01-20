package com.example.expertsub2.tvshow;

import androidx.lifecycle.ViewModel;

import com.example.expertsub2.lists.MovieModel;

import java.util.ArrayList;

public class ListTvShowViewModel extends ViewModel {
    private ArrayList<MovieModel> modelList = new ArrayList<>();

    public void addTvShowModel(String title, String overview, Integer poster){
        this.modelList.add(new MovieModel(title,overview,poster));
    }

    public ArrayList<MovieModel> getTvShowList() {
        return modelList;
    }
}

