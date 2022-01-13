package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class menu_makanan extends AppCompatActivity {

    // kamus variable
    ListView menu;
    Button minuman;
    public String makanan[] ={"Nasi Padang | Harga: 30.000","Sate Ayam | Harga: 20.000",
            "Sate Kambing | Harga: 20.000", "Soto Ayam | Harga: 15.000", "Soto Betawi | Harga: 17.000",
            "Ketupat Sayur | Harga: 13.000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_makanan);

        // klik item untuk deskripsi
        menu = (ListView) findViewById(R.id.menumakanan);

        ArrayAdapter adapter = new ArrayAdapter(menu_makanan.this, R.layout.support_simple_spinner_dropdown_item, makanan);
        menu.setAdapter(adapter);

        menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detail = new Intent(menu_makanan.this, detail_makanan.class);
                startActivity(detail);
            }
        });

        // tombol ke activity menu_minuman
        minuman = (Button) findViewById(R.id.btnminuman);
        minuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent minuman = new Intent(menu_makanan.this, menu_minuman.class);
                startActivity(minuman);
            }
        });

    }
}