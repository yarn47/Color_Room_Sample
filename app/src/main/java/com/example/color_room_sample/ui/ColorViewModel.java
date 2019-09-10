package com.example.color_room_sample.ui;

import android.widget.Toast;

import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.color_room_sample.AppExecutors;
import com.example.color_room_sample.ColorApplication;
import com.example.color_room_sample.api.response.ColorInfo;
import com.example.color_room_sample.db.RoomDataRepository;
import com.example.color_room_sample.db.entity.ColorEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.inject.Inject;


public class ColorViewModel extends ViewModel {
    private ObservableField<String> observableColorString = new ObservableField<>("");
    public MutableLiveData<ColorInfo> colorLiveData = new MutableLiveData<>();
    private List<ColorInfo> colorInfoList = new ArrayList<>();
    private ColorRepository colorRepository;
    public RoomDataRepository roomDataRepository;
    private AppExecutors appExecutors;

    public ColorTabAdapter.ColorTab colorTab = ColorTabAdapter.ColorTab.COLOR;

    @Inject
    ColorApplication colorApplication;

    @Inject
    public ColorViewModel(ColorRepository colorRepository, AppExecutors appExecutors,
                          RoomDataRepository roomDataRepository) {
        this.colorRepository = colorRepository;
        this.appExecutors = appExecutors;
        this.roomDataRepository = roomDataRepository;
    }

    public void onButtonedColor() {
        Random random = new Random();
        int nextInt = random.nextInt(0xffffff + 1);
        String colorCode = String.format("#%06x", nextInt);
        observableColorString.set(colorCode);

        Toast.makeText(ColorApplication.getColorApplication(),
                "colorCode : " + colorCode, Toast.LENGTH_SHORT).show();

        colorRepository.fetchingColorInfo(observableColorString.get(),
                colorInfo -> {
            colorInfoList.add(colorInfo);
            colorLiveData.postValue(colorInfo);
        });
    }

    public void onColorClicked(ColorInfo colorInfo) {
        if(colorInfo != null) {
            Toast.makeText(ColorApplication.getColorApplication(), "onButtoned : " + colorInfo.getHex().getValue(),
                    Toast.LENGTH_LONG).show();
            appExecutors.getDiskIO().execute(() -> {
                roomDataRepository.addColor(convertToEntity(colorInfo));
            });
        }
    }

    private ColorEntity convertToEntity(ColorInfo colorInfo) {
        ColorEntity colorEntity = new ColorEntity();
        colorEntity.setHexCode(colorInfo.getHex().getValue());
        colorEntity.setColorName(colorInfo.getName().getValue());
        colorEntity.setHslCode(colorInfo.getHsl().getValue());
        colorEntity.setHsvCode(colorInfo.getHsv().getValue());
        colorEntity.setRgbCode(colorInfo.getRgb().getValue());
        colorEntity.setContrast(colorInfo.getContrast().getValue());

        return colorEntity;
    }


    public interface ColorCallback {
        void onCallback(ColorInfo colorInfo);
    }
}
