package com.example.color_room_sample.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.color_room_sample.ui.color.ColorFragment;
import com.example.color_room_sample.ui.info.InfoFragment;

public class ColorTabAdapter extends FragmentPagerAdapter {

    public enum ColorTab{
        COLOR, INFO
    }

    public ColorTabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0) {
            return new ColorFragment();
        }else if(position == 1) {
            return new InfoFragment();
        }else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
