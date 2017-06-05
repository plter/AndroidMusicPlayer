package top.yunp.androidmusicplayer.controllers;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import top.yunp.androidmusicplayer.databinding.PlayerViewBinding;
import top.yunp.androidmusicplayer.fragments.SongListPagerAdapter;
import top.yunp.androidmusicplayer.databinding.ActivityMainBinding;

/**
 * Created by plter on 5/28/17.
 */

public class ActivityMainController {


    private ActivityMainBinding binding;
    private AppCompatActivity appCompatActivity;
    private PlayerController playerController;

    public ActivityMainController(ActivityMainBinding binding, AppCompatActivity appCompatActivity) {
        this.binding = binding;
        this.appCompatActivity = appCompatActivity;

        buildUI();
    }

    private void buildUI() {
        appCompatActivity.setSupportActionBar(binding.toolbar);
        SongListPagerAdapter sectionsPagerAdapter = new SongListPagerAdapter(appCompatActivity.getSupportFragmentManager());
        binding.container.setAdapter(sectionsPagerAdapter);
        binding.tabs.setupWithViewPager(binding.container);

        playerController = new PlayerController(PlayerViewBinding.inflate(LayoutInflater.from(binding.playerContainer.getContext()), binding.playerContainer, true));

    }
}
