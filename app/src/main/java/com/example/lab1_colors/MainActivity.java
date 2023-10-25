package com.example.lab1_colors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toColors = findViewById(R.id.toColorsButton);
        EditText input = findViewById(R.id.inputColorsField);

        toColors.setOnClickListener(view -> {
            toColors(input);
        });
    }

    private void toColors(EditText input) {
        String color = String.valueOf(input.getText()).toLowerCase().trim();

        switch (color) {
            case "red":
            case "blue":
            case "green":
                Intent intent = new Intent(getApplicationContext(), ColorsActivity.class);
                intent.putExtra("COLOR", color);
                startActivity(intent);
                break;
            default:
                Toast.makeText(getApplicationContext(), "Unknown color", Toast.LENGTH_LONG).show();
        }
    }
}
