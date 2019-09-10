package com.example.color_room_sample.ui.common;

import android.graphics.Color;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.example.color_room_sample.api.response.ColorInfo;
import com.example.color_room_sample.db.entity.ColorEntity;

public class BindingAdapters {

    @BindingAdapter("android:colorInfo")
    public static void setColorInfo(TextView textView, ColorInfo colorInfo) {
        if(colorInfo != null) {
            textView.setText(colorInfo.getName().value);
            textView.setTextColor(Color.parseColor(colorInfo.getContrast().getValue()));
            textView.setBackgroundColor(Color.parseColor(colorInfo.getHex().getValue()));
        }
    }

    @BindingAdapter("android:colorEntity")
    public static void setColorInfo(TextView textView, ColorEntity colorEntity) {
        if(colorEntity != null) {
            textView.setText(colorEntity.getColorName());
            textView.setTextColor(Color.parseColor(colorEntity.getContrast()));
            textView.setBackgroundColor(Color.parseColor(colorEntity.getHexCode()));
        }
    }

}
