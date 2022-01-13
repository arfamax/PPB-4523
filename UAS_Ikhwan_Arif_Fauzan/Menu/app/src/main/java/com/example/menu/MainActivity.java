package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.internal.ParcelableSparseArray;

public class MainActivity extends AppCompatActivity {

    // kamus variable
    Button Pesan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tombol pesan untuk ke tampilan menu
        Pesan = (Button) findViewById(R.id.pesan);

        Pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pesan = new Intent(MainActivity.this, menu_makanan.class);
                startActivity(pesan);
            }
        });
    }
}