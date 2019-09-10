package com.example.color_room_sample.di.component;

import com.example.color_room_sample.ColorApplication;
import com.example.color_room_sample.di.module.ActivityModule;
import com.example.color_room_sample.di.module.ColorAppModule;
import com.example.color_room_sample.di.module.NetworkModule;
import com.example.color_room_sample.ui.color.ColorFragmentProvider;
import com.example.color_room_sample.ui.info.InfoFragmentProvider;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, ColorAppModule.class, NetworkModule.class, ActivityModule.class
, ColorFragmentProvider.class, InfoFragmentProvider.class})
public interface ColorComponent extends AndroidInjector<ColorApplication> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<ColorApplication> {}
}
