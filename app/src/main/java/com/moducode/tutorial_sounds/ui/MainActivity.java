package com.moducode.tutorial_sounds.ui;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.moducode.tutorial_sounds.R;
import com.moducode.tutorial_sounds.ui.fragment.SoundsListFragment;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected Fragment getFragment() {
        return new SoundsListFragment();
    }
}
