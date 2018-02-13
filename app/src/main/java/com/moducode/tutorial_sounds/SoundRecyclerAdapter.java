package com.moducode.tutorial_sounds;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by Jay on 2018-02-12.
 */

public class SoundRecyclerAdapter extends RecyclerView.Adapter<SoundRecyclerAdapter.SoundViewHolder>{

    private static final String TAG = "SoundRecyclerAdapter";

    private final SoundPlayer soundPlayer;

    public SoundRecyclerAdapter(SoundPlayer soundPlayer) {
        this.soundPlayer = soundPlayer;
    }

    @Override
    public SoundViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View soundView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_sound, parent, false);
        return new SoundViewHolder(soundView);
    }

    @Override
    public void onBindViewHolder(SoundViewHolder holder, int position) {
        Sound s = soundPlayer.getSounds().get(position);

        holder.sound.setText(s.getFileName());
    }


    @Override
    public int getItemCount() {
        return soundPlayer.getSounds().size();
    }

    public void cleanUp() {
        soundPlayer.release();
    }

    class SoundViewHolder extends RecyclerView.ViewHolder{

        Button sound;

        SoundViewHolder(View itemView) {
            super(itemView);
            sound = itemView.findViewById(R.id.sound_button);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    soundPlayer.play(soundPlayer.getSounds().get(getAdapterPosition()));
                }
            });
        }
    }

}
