package com.example.color_room_sample.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.color_room_sample.api.response.ColorInfo;
import com.example.color_room_sample.databinding.ListItemNameBinding;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ColorViewHolder> {

    private List<ColorInfo> colorInfoList = new ArrayList<>();

    private ColorViewModel colorViewModel;

    @Inject
    public ColorAdapter(ColorViewModel colorViewModel) {
        super();
        this.colorViewModel = colorViewModel;
    }

    public void addColorList(ColorInfo colorInfo) {
        this.colorInfoList.add(colorInfo);
        notifyItemInserted(getItemCount() - 1);
    }

    public void addAllColorList(List<ColorInfo> colorInfoList) {
        this.colorInfoList.clear();
        this.colorInfoList.addAll(colorInfoList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemNameBinding listItemColorBinding = ListItemNameBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ColorViewHolder(listItemColorBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder holder, int position) {
        if(position < getItemCount()) {
            ColorInfo colorInfo = getItem(position);
            holder.listItemColorBinding.setColorInfo(colorInfo);
            holder.listItemColorBinding.setViewModel(colorViewModel);
        }
    }

    @Override
    public int getItemCount() {

        if(colorInfoList != null && !colorInfoList.isEmpty()) {
            return colorInfoList.size();
        }

        return 0;
    }

    private ColorInfo getItem(int position) {

        if(colorInfoList != null && colorInfoList.size() > 0) {
            return colorInfoList.get(position);
        }

        return null;
    }

    public class ColorViewHolder extends RecyclerView.ViewHolder {

        ListItemNameBinding listItemColorBinding;

        public ColorViewHolder(@NonNull ListItemNameBinding listItemColorBinding) {
            super(listItemColorBinding.getRoot());
            this.listItemColorBinding = listItemColorBinding;
        }
    }
}
