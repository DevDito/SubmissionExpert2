package com.example.expertsub2.tvshow;

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
import com.example.expertsub2.lists.MovieModel;

public class ListTvShowFragment extends Fragment {

    private ListTvShowViewModel mViewModel;
    private ListMovieAdapter mAdapter;

    public static ListTvShowFragment newInstance() {
        return new ListTvShowFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_tv_show_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        mViewModel = ViewModelProviders.of(this).get(ListTvShowViewModel.class);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_god), getString(R.string.tv_overview_god),R.drawable.tv_poster_god);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_gotham), getString(R.string.tv_overview_gotham),R.drawable.tv_poster_gotham);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_grey_anatomy), getString(R.string.tv_overview_grey_anatomy),R.drawable.tv_poster_grey_anatomy);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_hanna), getString(R.string.tv_overview_hanna),R.drawable.tv_poster_hanna);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_iron_fist), getString(R.string.tv_overview_iron_fist),R.drawable.tv_poster_iron_fist);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_naruto_shipudden), getString(R.string.tv_overview_naruto_shipudden),R.drawable.tv_poster_naruto_shipudden);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_ncis), getString(R.string.tv_overview_ncis),R.drawable.tv_poster_ncis);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_riverdale), getString(R.string.tv_overview_riverdale),R.drawable.tv_poster_riverdale);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_shameless), getString(R.string.tv_overview_shameless),R.drawable.tv_poster_shameless);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_supergirl), getString(R.string.tv_overview_supergirl),R.drawable.tv_poster_supergirl);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_supernatural), getString(R.string.tv_overview_supernatural),R.drawable.tv_poster_supernatural);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_the_simpson), getString(R.string.tv_overview_the_simpson),R.drawable.tv_poster_the_simpson);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_the_umbrella), getString(R.string.tv_overview_the_umbrella),R.drawable.tv_poster_the_umbrella);
        mViewModel.addTvShowModel(getResources().getString(R.string.tv_title_the_walking_dead), getString(R.string.tv_overview_the_walking_dead),R.drawable.tv_poster_the_walking_dead);

        mAdapter = new ListMovieAdapter(view.getContext(),mViewModel.getTvShowList());
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
