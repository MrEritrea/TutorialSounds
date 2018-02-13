package com.moducode.tutorial_sounds.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.moducode.tutorial_sounds.R;

/**
 * Created by Jay on 2018-02-12.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupFragment();
    }

    private void setupFragment() {
        FragmentManager fm = getSupportFragmentManager();

        Fragment f = fm.findFragmentById(R.id.fragment_container);
        if(f == null){
            f = getFragment();
            fm.beginTransaction()
                    .replace(R.id.fragment_container, f)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
        }

    }


    protected abstract Fragment getFragment();

}
