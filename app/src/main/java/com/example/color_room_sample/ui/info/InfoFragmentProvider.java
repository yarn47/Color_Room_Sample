package com.example.color_room_sample.ui.info;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class InfoFragmentProvider {

    @ContributesAndroidInjector(modules = InfoFragmentModule.class)
    abstract InfoFragment provideInfoFragment();
}
