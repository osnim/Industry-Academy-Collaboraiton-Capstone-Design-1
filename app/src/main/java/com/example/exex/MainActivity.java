package com.example.exex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ImageButton chartbutton;
    private ImageButton connectbutton;
    private ImageButton userbutton;
    private ImageButton setupbutton;

    private TextView textviewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chartbutton = findViewById(R.id.chartbutton);
        chartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , ChartActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });

        connectbutton = findViewById(R.id.connectbutton);
        connectbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , ConnectActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });

        userbutton = findViewById(R.id.userbutton);
        userbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , UserActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });

        setupbutton = findViewById(R.id.setupbutton);
        setupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , SetupActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });

    }
}