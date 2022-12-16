package com.marcod.finalproject4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class ListActivity extends AppCompatActivity {

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        cardView = findViewById(R.id.cardView);
        cardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
            startActivity(intent);

        });
    }
}