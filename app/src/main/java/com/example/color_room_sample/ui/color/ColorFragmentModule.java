package com.example.color_room_sample.ui.color;

import androidx.lifecycle.ViewModelProvider;

import com.example.color_room_sample.ui.ColorAdapter;
import com.example.color_room_sample.ui.ColorViewModel;
import com.example.color_room_sample.util.ViewModelProviderFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ColorFragmentModule {

    @Provides
    ColorAdapter provideColorAdapter(ColorViewModel colorViewModel) {
        return new ColorAdapter(colorViewModel);
    }

    @Provides
    ViewModelProvider.Factory provideColorViewModel(ColorViewModel colorViewModel) {
        return new ViewModelProviderFactory<>(colorViewModel);
    }
}
