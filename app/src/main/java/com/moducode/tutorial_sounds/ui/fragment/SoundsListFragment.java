package com.moducode.tutorial_sounds.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moducode.tutorial_sounds.R;
import com.moducode.tutorial_sounds.SoundPlayer;
import com.moducode.tutorial_sounds.SoundRecyclerAdapter;

public class SoundsListFragment extends Fragment {

    private RecyclerView soundsRecycler;
    private SoundRecyclerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_sounds_list, container, false);
        soundsRecycler = v.findViewById(R.id.recycler_sounds);

        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SoundPlayer player = new SoundPlayer(getActivity().getApplicationContext());
        adapter = new SoundRecyclerAdapter(player);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        soundsRecycler.setLayoutManager(gridLayoutManager);
        soundsRecycler.setAdapter(adapter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        adapter.cleanUp();
    }
}
