package com.example.exex;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CO2Sensor extends Fragment {
    public View view;

    //추가저장필요
    public static CO2Sensor newInstance(){
        CO2Sensor co2Sensor = new CO2Sensor();
        return co2Sensor;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.co2_sensor,container, false);

        return view;
    }
}
