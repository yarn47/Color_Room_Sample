package com.example.color_room_sample.di.module;

import com.example.color_room_sample.ui.ColorActivity;
import com.example.color_room_sample.ui.ColorModule;
import com.example.color_room_sample.ui.color.ColorFragmentProvider;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector(modules = {ColorModule.class})
    abstract ColorActivity contributeMainActivity();

}
