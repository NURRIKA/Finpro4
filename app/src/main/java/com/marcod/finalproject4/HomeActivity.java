package com.marcod.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button search_buses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        search_buses = findViewById(R.id.search_buses);
        search_buses.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ListActivity.class);
            startActivity(intent);
        });
    }
}