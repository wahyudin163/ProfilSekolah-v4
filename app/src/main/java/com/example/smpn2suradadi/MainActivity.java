package com.example.smpn2suradadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void tugas(View view) {
        Intent intent = new Intent(MainActivity.this, TugasActivity.class);
        startActivity(intent);
    }



    public void eskul(View view) {
        Intent intent = new Intent(MainActivity.this, EskulActivity.class);
        startActivity(intent);
    }

    public void prestasi(View view) {
        Intent intent = new Intent(MainActivity.this, PrestasiActivity.class);
        startActivity(intent);
    }
    public void informasi(View view) {
        Intent intent = new Intent(MainActivity.this, InformasiActivity.class);
        startActivity(intent);
    }

}