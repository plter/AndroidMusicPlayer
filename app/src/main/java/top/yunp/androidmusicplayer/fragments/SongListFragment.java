package top.yunp.androidmusicplayer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import top.yunp.androidmusicplayer.controllers.SongListController;
import top.yunp.androidmusicplayer.databinding.SongListBinding;

/**
 * Created by plter on 5/28/17.
 */

public class SongListFragment extends AbstractListFragment {


    private SongListController songListController;

    public SongListFragment() {
        setupWithTitle("歌曲");
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        SongListBinding binding = SongListBinding.inflate(inflater, container, false);
        songListController = new SongListController(binding);
        return binding.getRoot();
    }
}
