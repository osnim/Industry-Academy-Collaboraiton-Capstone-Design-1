package com.example.exex;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DustSensor extends Fragment {
    public View view;
    private TextView textviewResult;


    //추가저장필요
    public static DustSensor newInstance(){
        DustSensor dustSensor = new DustSensor();
        return dustSensor;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.dust_sensor,container, false);

        return view;
    }

}
