package com.example.color_room_sample.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.color_room_sample.db.dao.ColorDao;
import com.example.color_room_sample.db.entity.ColorEntity;

@Database(entities = ColorEntity.class, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    abstract ColorDao getColorDao();
}
