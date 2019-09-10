package com.example.color_room_sample.di.module;

import android.content.Context;

import androidx.room.PrimaryKey;
import androidx.room.Room;

import com.example.color_room_sample.AppExecutors;
import com.example.color_room_sample.ColorApplication;
import com.example.color_room_sample.db.AppDatabase;
import com.example.color_room_sample.db.RoomDataRepository;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ColorAppModule {

    @Singleton
    @Provides
    Context provideContext(ColorApplication application){
        return application;
    }

    @Singleton
    @Provides
    Gson provideGson(){
        return new Gson();
    }

    @Singleton
    @Provides
    AppExecutors provideAppExecutors() {
        return new AppExecutors();
    }

    @Singleton
    @Provides
    AppDatabase provideAppDataBase(ColorApplication colorApplication) {
        return Room.databaseBuilder(colorApplication.getApplicationContext(), AppDatabase.class, "ColorInfo").build();
    }

    @Singleton
    @Provides
    RoomDataRepository provideRoomDataRepository(ColorApplication colorApplication) {
        return new RoomDataRepository(provideAppDataBase(colorApplication));
    }
}
