package com.example.expertsub2.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.expertsub2.R;
import com.example.expertsub2.lists.ListMoviesFragment;
import com.example.expertsub2.tvshow.ListTvShowFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;
    private ListMoviesFragment moviesFragment;
    private ListTvShowFragment tvShowFragment;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        moviesFragment = new ListMoviesFragment();
        tvShowFragment = new ListTvShowFragment();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new ListMoviesFragment();
            case 1 :
                return new ListTvShowFragment();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
