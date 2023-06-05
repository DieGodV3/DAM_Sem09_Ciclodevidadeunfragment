package com.example.dam_sem09_ciclodevidafragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ciclo De Vida","Fragmento está onCreate");
        Toast.makeText(this, "Mensaje desde el Activity", Toast.LENGTH_LONG).show();

    }
}