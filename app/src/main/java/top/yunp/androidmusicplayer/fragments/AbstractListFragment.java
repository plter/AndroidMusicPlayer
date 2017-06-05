package top.yunp.androidmusicplayer.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public abstract class AbstractListFragment extends Fragment {

    public static final String KEY_TITLE = "title";

    public AbstractListFragment() {
    }

    public void setupWithTitle(String title) {
        Bundle b = new Bundle();
        b.putString(KEY_TITLE, title);
        setArguments(b);
    }

    public String getTitle() {
        return getArguments().getString(KEY_TITLE);
    }
}
