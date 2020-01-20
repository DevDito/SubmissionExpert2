package com.example.expertsub2.lists;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.expertsub2.R;
import com.example.expertsub2.detail.DetailMovie;
import com.example.expertsub2.list.ListMovieAdapter;
import com.example.expertsub2.list.Movie;

public class ListMoviesFragment extends Fragment {

    private ListModelView mViewModel;
    private ListMovieAdapter mAdapter;

    public static ListMoviesFragment newInstance() {
        return new ListMoviesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_movies_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        mViewModel = ViewModelProviders.of(this).get(ListModelView.class);
        mViewModel.addMovieModel(getResources().getString(R.string.title_avenger_end_game),getString(R.string.overview_avenger_end_game),R.drawable.poster1);
        mViewModel.addMovieModel(getResources().getString(R.string.title_parasite),getString(R.string.overview_parasite),R.drawable.poster2);
        mViewModel.addMovieModel(getResources().getString(R.string.title_toy_story_4),getString(R.string.overview_toy_story_4),R.drawable.poster3);
        mViewModel.addMovieModel(getResources().getString(R.string.title_joker),getString(R.string.title_joker),R.drawable.poster4);
        mViewModel.addMovieModel(getResources().getString(R.string.title_the_farewell),getString(R.string.overview_the_farewell),R.drawable.poster5);
        mViewModel.addMovieModel(getResources().getString(R.string.title_booksmart),getString(R.string.overview_booksmart),R.drawable.poster6);
        mViewModel.addMovieModel(getResources().getString(R.string.title_shazam),getString(R.string.overview_shazam),R.drawable.poster7);
        mViewModel.addMovieModel(getResources().getString(R.string.title_glass),getString(R.string.overview_glass),R.drawable.poster8);
        mViewModel.addMovieModel(getResources().getString(R.string.title_aquaman),getString(R.string.overview_aquaman),R.drawable.poster9);
        mViewModel.addMovieModel(getResources().getString(R.string.title_avengerinfinity),getString(R.string.overview_avengerinfinity),R.drawable.poster10);
        mViewModel.addMovieModel(getResources().getString(R.string.title_deadpool),getString(R.string.overview_deadpool),R.drawable.poster11);
        mViewModel.addMovieModel(getResources().getString(R.string.title_bumblebee),getString(R.string.overview_bumblebee),R.drawable.poster12);
        mViewModel.addMovieModel(getResources().getString(R.string.title_venom),getString(R.string.overview_venom),R.drawable.poster13);
        mViewModel.addMovieModel(getResources().getString(R.string.title_spiderman),getString(R.string.overview_spiderman),R.drawable.poster14);
        mViewModel.addMovieModel(getResources().getString(R.string.title_dragon),getString(R.string.overview_dragon),R.drawable.poster15);

        mAdapter = new ListMovieAdapter(view.getContext(),mViewModel.getModelList());
        recyclerView.setAdapter(mAdapter);
        recyclerView.setHasFixedSize(true);

        mAdapter.SetOnItemClickListener(new ListMovieAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, MovieModel model) {
                Intent goToDetailMovie = new Intent(view.getContext(), DetailMovie.class);
                goToDetailMovie.putExtra(Movie.SELECTED_MOVIE,model);
                startActivity(goToDetailMovie);
            }
        });
    }

}
