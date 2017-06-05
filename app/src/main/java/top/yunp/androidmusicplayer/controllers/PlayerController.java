package top.yunp.androidmusicplayer.controllers;

import android.databinding.ObservableInt;
import android.view.View;
import android.widget.Toast;

import top.yunp.androidmusicplayer.databinding.PlayerViewBinding;

/**
 * Created by plter on 5/28/17.
 */

public class PlayerController {


    private PlayerViewBinding binding;
    private ObservableInt btnPlayOrPauseIcon = new ObservableInt(android.R.drawable.ic_media_play);

    public PlayerController(PlayerViewBinding binding) {
        this.binding = binding;
        binding.setPresenter(this);
        binding.setBtnPlayOrPauseIcon(btnPlayOrPauseIcon);
    }

    public void btnPlayOrPauseClicked(View v) {
        if (btnPlayOrPauseIcon.get() == android.R.drawable.ic_media_play) {
            btnPlayOrPauseIcon.set(android.R.drawable.ic_media_pause);
            //TODO action play
        } else {
            btnPlayOrPauseIcon.set(android.R.drawable.ic_media_play);
            //TODO action pause
        }
    }

    public void btnShowPlayListClicked(View v) {
        Toast.makeText(v.getContext(), "Show play list", Toast.LENGTH_SHORT).show();
    }
}
