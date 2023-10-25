package com.example.lab1_colors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ColorsActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        Intent intent = getIntent();
        String color = intent.getStringExtra("COLOR");
        ConstraintLayout layout = findViewById(R.id.colors_layout);

        if (color == null) {
            color = "null";
        }

        switch (color) {
            case "red":
                layout.setBackgroundResource(R.color.red);
                break;
            case "blue":
                layout.setBackgroundResource(R.color.blue);
                break;
            case "green":
                layout.setBackgroundResource(R.color.green);
                break;
        }

        layout.setOnClickListener(view -> finish());
    }
}
