package com.example.color_room_sample;

import com.example.color_room_sample.di.component.DaggerColorComponent;
import com.facebook.stetho.Stetho;

import dagger.android.AndroidInjector;

public class ColorApplication extends BaseApplication {

    private static ColorApplication colorApplication;


    @Override
    public void onCreate() {
        super.onCreate();
        colorApplication = this;
        Stetho.initializeWithDefaults(this);
    }

    public static ColorApplication getColorApplication() {
        return colorApplication;
    }

    @Override
    protected AndroidInjector<? extends BaseApplication> applicationInjector() {
        return DaggerColorComponent.builder().create(this);
    }
}
