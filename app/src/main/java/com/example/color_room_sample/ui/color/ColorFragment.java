package com.example.color_room_sample.ui.color;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.color_room_sample.R;
import com.example.color_room_sample.api.response.ColorInfo;
import com.example.color_room_sample.databinding.FragmentColorBinding;
import com.example.color_room_sample.ui.ColorActivity;
import com.example.color_room_sample.ui.ColorAdapter;
import com.example.color_room_sample.ui.ColorViewModel;
import com.example.color_room_sample.ui.common.BaseFragment;

import javax.inject.Inject;

public class ColorFragment extends BaseFragment<ColorViewModel> {

    @Inject
    ColorAdapter colorAdapter;
    @Inject
    ViewModelProvider.Factory factory;

    @Override
    public ColorViewModel getViewModel() {
        return ViewModelProviders.of(getActivity(), factory).get(ColorViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmentColorBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_color, container, false);
        binding.setViewModel(getViewModel());
        binding.getViewModel().colorLiveData.observe(this, colorInfo -> {
            if(colorInfo != null) {
                colorAdapter.addColorList(colorInfo);
            }
        });
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        binding.recyclerView.setAdapter(colorAdapter);

        return binding.getRoot();
    }


}
