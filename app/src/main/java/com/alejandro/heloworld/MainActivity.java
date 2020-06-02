package com.alejandro.heloworld;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // declaramos objetos que se llaman tvhola y ethola
        //el R.id.tcHola -a R hace referencia a librerias de android
        //final TextView tvHola = findViewById(R.id.tvHola);
        final EditText etHola = findViewById(R.id.etHola);
        Button btHola = findViewById(R.id.btHola);
        btHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hola = etHola.getText().toString();
                if (hola.isEmpty()) {
                    return;
                }
                //tvHola.setText(hola);
                //creamos objeto constructor le mandamos el mainactivity y el segundo
                //parametro es hacia donde va a ir esa activity

                Intent intent = new Intent(MainActivity.this, HelloActivity.class );
                // enviar informacion extra (envia "hola", con el nombre  "msgHola)
                intent.putExtra("msgHola", hola);
                startActivity(intent);

            }
        });

        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.
                        make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}