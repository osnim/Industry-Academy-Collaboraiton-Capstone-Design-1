package com.example.exex;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ConnectActivity extends AppCompatActivity {

    ToggleButton tb, tba, tbf, tball;
    TextView tv, tva, tvf, tvall;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        tb = findViewById(R.id.togglebtn);
        tba = findViewById(R.id.togglebtnair);
        tbf = findViewById(R.id.togglebtnfan);
        tball = findViewById(R.id.togglebtnall);
        tv = findViewById(R.id.textView);
        tva = findViewById(R.id.textViewAir);
        tvf = findViewById(R.id.textViewFan);
        tvall = findViewById(R.id.textViewAll);


        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(tb.isChecked()){
                    tv.setTextColor(Color.BLACK);
                }else {
                    tv.setTextColor(0x74000000);
                }
            }
        });

        tba.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(tba.isChecked()){
                    tva.setTextColor(Color.BLACK);
                }else {
                    tva.setTextColor(0x74000000);
                }
            }
        });

        tbf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(tbf.isChecked()){
                    tvf.setTextColor(Color.BLACK);
                }else {
                    tvf.setTextColor(0x74000000);
                }
            }
        });

        tball.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(tball.isChecked()){
                    tvall.setTextColor(Color.BLACK);
                    tb.setChecked(true);
                    tba.setChecked(true);
                    tbf.setChecked(true);
                }else {
                    tvall.setTextColor(0x74000000);
                    tb.setChecked(false);
                    tba.setChecked(false);
                    tbf.setChecked(false);
                }
            }
        });





    }
}