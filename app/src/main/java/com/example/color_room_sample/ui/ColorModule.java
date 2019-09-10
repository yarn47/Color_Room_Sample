package com.example.color_room_sample.ui;

import android.app.Activity;
import android.content.Context;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.color_room_sample.R;
import com.example.color_room_sample.api.ColorAPIService;
import com.example.color_room_sample.databinding.ActivityMainBinding;
import com.example.color_room_sample.util.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;
import kotlin.jvm.JvmStatic;

@Module
public class ColorModule {

    @Provides
    ViewModelProvider.Factory provideColorViewModel(ColorViewModel colorViewModel) {
        return new ViewModelProviderFactory<>(colorViewModel);
    }

    @Provides
    ColorRepository provideColorRepository(ColorAPIService apiService) {
        return new ColorRepository(apiService);
    }

    @JvmStatic
    @Provides
    ActivityMainBinding provideActivityMainBinding(ColorActivity colorActivity) {
        return DataBindingUtil.setContentView(colorActivity, R.layout.activity_main);
    }
}
