package com.example.color_room_sample.ui;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.color_room_sample.R;
import com.example.color_room_sample.databinding.ActivityMainBinding;
import com.example.color_room_sample.databinding.TabIconBinding;
import com.example.color_room_sample.ui.common.BaseActivity;
import com.google.android.material.tabs.TabLayout;

import javax.inject.Inject;

public class ColorActivity extends BaseActivity<ColorViewModel> {

    @Inject
    ActivityMainBinding binding;
    @Inject
    ViewModelProvider.Factory factory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.setViewModel(getViewModel());
        binding.viewPager.setOffscreenPageLimit(2);
        binding.viewPager.setAdapter(new ColorTabAdapter(getSupportFragmentManager()));
        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                getViewModel().colorTab = ColorTabAdapter.ColorTab.values()[position];
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        for(ColorTabAdapter.ColorTab tab : ColorTabAdapter.ColorTab.values()) {
            TabIconBinding iconBinding = DataBindingUtil.inflate(LayoutInflater.from(this.getApplicationContext()),
                    R.layout.tab_icon, null, false);
            iconBinding.ivIcon.setText(tab.name());
            binding.tabLayout.getTabAt(tab.ordinal()).setCustomView(iconBinding.getRoot());
        }

    }

    @Override
    public ColorViewModel getViewModel() {
        return ViewModelProviders.of(this, factory).get(ColorViewModel.class);
    }
}
