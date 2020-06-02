package com.alejandro.heloworld;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {
    // usar ctrl + o, y seleccionar onCreate para traer un metodo
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // para traernos al layout
        setContentView(R.layout.activity_hello);
        TextView tvHola = findViewById(R.id.tvHola);
        String msg = getIntent().getStringExtra("msgHola");
        // con el siguiente podemos seleccionar Logcat-->error y ver este tag
        Log.e("debug", msg);
        tvHola.setText(msg);
    }
}
