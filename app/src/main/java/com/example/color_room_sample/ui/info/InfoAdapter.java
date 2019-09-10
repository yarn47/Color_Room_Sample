package com.example.color_room_sample.ui.info;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.color_room_sample.databinding.ListItemColorBinding;
import com.example.color_room_sample.db.entity.ColorEntity;

import java.util.ArrayList;
import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoHolder> {

    List<ColorEntity> infoList = new ArrayList<>();

    @NonNull
    @Override
    public InfoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ListItemColorBinding binding = ListItemColorBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new InfoHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull InfoHolder holder, int position) {
        if(position < getItemCount()) {
            ColorEntity colorEntity = getItem(position);
            holder.listItemColorBinding.setColorEntity(colorEntity);
        }
    }

    private ColorEntity getItem(int position) {
        if(infoList != null && infoList.size() > 0) {
            return infoList.get(position);
        }
        return null;
    }

    @Override
    public int getItemCount() {
        if(infoList != null && infoList.size() > 0) {
            return infoList.size();
        }
        return 0;
    }

    public void addEntities(List<ColorEntity> entities) {
        this.infoList.clear();
        this.infoList.addAll(entities);
        notifyDataSetChanged();
    }

    public class InfoHolder extends RecyclerView.ViewHolder {

        ListItemColorBinding listItemColorBinding;

        public InfoHolder(@NonNull ListItemColorBinding binding) {
            super(binding.getRoot());
            this.listItemColorBinding = binding;
        }
    }
}
