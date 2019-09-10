package com.example.color_room_sample.db;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.color_room_sample.ColorApplication;
import com.example.color_room_sample.db.dao.ColorDao;
import com.example.color_room_sample.db.entity.ColorEntity;

import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Unit;

public class RoomDataRepository {

    AppDatabase appDatabase;
    ColorDao colorDao;

    @Inject
    public RoomDataRepository(AppDatabase appDatabase) {
        this.appDatabase = appDatabase;
        colorDao = appDatabase.getColorDao();
    }

    public LiveData<List<ColorEntity>> getColors() {
        return appDatabase.getColorDao().getColorInfos();
    }

    public void addColor(ColorEntity colorEntity) {
        colorDao.insert(colorEntity);
    }
}
