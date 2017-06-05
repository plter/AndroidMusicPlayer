package top.yunp.androidmusicplayer.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import top.yunp.androidmusicplayer.fragments.AbstractListFragment;
import top.yunp.androidmusicplayer.fragments.AlbumListFragment;
import top.yunp.androidmusicplayer.fragments.SingerListFragment;
import top.yunp.androidmusicplayer.fragments.SongListFragment;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SongListPagerAdapter extends FragmentPagerAdapter {


    private List<AbstractListFragment> fragments = new ArrayList<>();

    public SongListPagerAdapter(FragmentManager fm) {
        super(fm);

        fragments.add(new SongListFragment());
        fragments.add(new SingerListFragment());
        fragments.add(new AlbumListFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).getTitle();
    }
}
