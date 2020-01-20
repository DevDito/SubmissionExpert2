package com.example.expertsub2.detail;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.expertsub2.R;
import com.example.expertsub2.list.Movie;
import com.example.expertsub2.lists.MovieModel;

public class DetailMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);
        TextView tvTitle = findViewById(R.id.tv_title);
        TextView tvOverview = findViewById(R.id.tv_overview);

        ImageView imgPoster = findViewById(R.id.img_poster);
        MovieModel watchModel = getIntent().getParcelableExtra(Movie.SELECTED_MOVIE);
        tvTitle.setText(watchModel.getTitle());
        tvOverview.setText(watchModel.getOverview());
        imgPoster.setImageResource(watchModel.getPoster());
        setTitle(watchModel.getTitle());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
