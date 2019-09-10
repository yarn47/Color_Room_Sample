package com.example.color_room_sample.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "colorInfo")
public class ColorEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo
    private String colorName;

    @ColumnInfo
    private String hexCode;

    @ColumnInfo
    private String hsvCode;

    @ColumnInfo
    private String rgbCode;

    @ColumnInfo
    private String hslCode;

    @ColumnInfo
    private String contrast;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContrast() {
        return contrast;
    }

    public void setContrast(String contrast) {
        this.contrast = contrast;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getHexCode() {
        return hexCode;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHsvCode() {
        return hsvCode;
    }

    public void setHsvCode(String hsvCode) {
        this.hsvCode = hsvCode;
    }

    public String getRgbCode() {
        return rgbCode;
    }

    public void setRgbCode(String rgbCode) {
        this.rgbCode = rgbCode;
    }

    public String getHslCode() {
        return hslCode;
    }

    public void setHslCode(String hslCode) {
        this.hslCode = hslCode;
    }
}
