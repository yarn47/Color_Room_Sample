package com.example.color_room_sample.ui.info;

import androidx.lifecycle.ViewModelProvider;

import com.example.color_room_sample.ui.ColorViewModel;
import com.example.color_room_sample.util.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class InfoFragmentModule {

    @Provides
    ViewModelProvider.Factory provideColorViewModel(ColorViewModel colorViewModel) {
        return new ViewModelProviderFactory<>(colorViewModel);
    }

    @Provides
    InfoAdapter provideInfoAdapter() {
        return new InfoAdapter();
    }

}
