package com.example.expertsub2.lists;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class ListModelView extends ViewModel {

    private ArrayList<MovieModel> modelList = new ArrayList<>();

    public void addMovieModel(String title, String overview, Integer poster){
        this.modelList.add(new MovieModel(title,overview,poster));
    }

    public ArrayList<MovieModel> getModelList() {
        return modelList;
    }

}
