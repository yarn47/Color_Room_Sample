package com.example.color_room_sample.ui.color;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ColorFragmentProvider {

    @ContributesAndroidInjector(modules = ColorFragmentModule.class)
    abstract ColorFragment provideColorFragment();

}
