package top.yunp.androidmusicplayer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import top.yunp.androidmusicplayer.R;

/**
 * Created by plter on 5/28/17.
 */

public class SingerListFragment extends AbstractListFragment {

    public SingerListFragment() {
        setupWithTitle("歌手");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.singer_list, null);
    }
}
