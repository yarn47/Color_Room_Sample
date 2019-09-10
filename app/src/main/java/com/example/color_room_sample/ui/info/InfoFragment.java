package com.example.color_room_sample.ui.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.color_room_sample.R;
import com.example.color_room_sample.databinding.FragmentInfoBinding;
import com.example.color_room_sample.db.entity.ColorEntity;
import com.example.color_room_sample.ui.ColorViewModel;
import com.example.color_room_sample.ui.common.BaseFragment;

import java.util.List;

import javax.inject.Inject;

public class InfoFragment extends BaseFragment {

    @Inject
    ViewModelProvider.Factory factory;

    @Inject
    InfoAdapter infoAdapter;

    @Override
    public ColorViewModel getViewModel() {
        return ViewModelProviders.of(getActivity(), factory).get(ColorViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        FragmentInfoBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_info, container,
                false);

        binding.setViewModel(getViewModel());
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        binding.recyclerView.setAdapter(infoAdapter);

        binding.getViewModel().roomDataRepository.getColors().observe(this, colorEntities -> {
            if(colorEntities != null && colorEntities.size() > 0) {
                infoAdapter.addEntities(colorEntities);
            }
        });

        return binding.getRoot();
    }
}
