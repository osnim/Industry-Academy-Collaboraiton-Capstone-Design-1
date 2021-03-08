package com.example.exex;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    //fragment 교체를 보여주는 처리를 구현한 곳
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) { //switch문으로 현 위치에따라 어떤 view를 띄워줄지 나타냄
            case 0:
                return DustSensor.newInstance();
            case 1:
                return COSensor.newInstance();
            case 2:
                return CO2Sensor.newInstance();
            case 3:
                return TempHumiSensor.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4; //위에 case의 갯수에 따라 달라짐
    }

    // 상단의 탭 레이아웃 인디케이터 쪽에 텍스트를 선언해주는 곳
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) { //switch문으로 현 위치에따라 어떤 view를 띄워줄지 나타냄
            case 0:
                return "Dust Sensor";
            case 1:
                return "CO Sensor";
            case 2:
                return "CO2 Sensor";
            case 3:
                return "TempHum Sensor";
            default:
                return null;
        }
    }

}
