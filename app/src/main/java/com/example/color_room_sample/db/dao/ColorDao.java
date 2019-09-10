package com.example.color_room_sample.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.color_room_sample.db.BaseDao;
import com.example.color_room_sample.db.entity.ColorEntity;

import java.util.List;

import io.reactivex.Maybe;

@Dao
public interface ColorDao extends BaseDao<ColorEntity> {

    @Insert
    @Override
    void insert(ColorEntity colorEntity);

    @Delete
    @Override
    void delete(ColorEntity colorEntity);

    @Update
    @Override
    void update(ColorEntity colorEntity);

    @Query("Select * from colorInfo")
    LiveData<List<ColorEntity>> getColorInfos();

    @Query("Select * from colorInfo where hexCode = :hexCode")
    ColorEntity get(String hexCode);
}
