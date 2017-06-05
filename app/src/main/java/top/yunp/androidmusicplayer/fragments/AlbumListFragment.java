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

public class AlbumListFragment extends AbstractListFragment {

    public AlbumListFragment() {
        setupWithTitle("专辑");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.album_list, null);
    }
}
