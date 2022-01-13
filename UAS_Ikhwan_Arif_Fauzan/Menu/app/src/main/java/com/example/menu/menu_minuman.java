package com.example.menu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class menu_minuman extends AppCompatActivity {
    // kamus variable
    ListView menu;
    Button makanan;
    Button pesan;
    public String minuman[] ={"Jus Jeruk | Harga: 10.000","Coffe Latte | Harga: 15.000",
            "Jus Alpukat | Harga: 20.000", "Es Teh Hijau | Harga: 10.000", "Es Teh | Harga: 8.000",
            "Jus Mangga | Harga: 12.000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_minuman);

        // klik item untuk deskripsi
        menu = (ListView) findViewById(R.id.menuminuman);

        ArrayAdapter adapter = new ArrayAdapter(menu_minuman.this, R.layout.support_simple_spinner_dropdown_item, minuman);
        menu.setAdapter(adapter);

        menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detail = new Intent(menu_minuman.this, detail_minuman.class);
                startActivity(detail);
            }
        });

        // tombol ke activity menu_makanan
        makanan = (Button) findViewById(R.id.btnmakanan);
        makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent makanan = new Intent(menu_minuman.this, menu_makanan.class);
                startActivity(makanan);
            }
        });

        // popup saat memesan
        pesan = (Button) findViewById(R.id.checkout);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popuppesan();
            }
        });
    }
    private void popuppesan(){
        AlertDialog.Builder popesan = new AlertDialog.Builder(this);
        popesan.setTitle("Mohon Tunggu Pesanan...");

        popesan
                .setMessage("Terima Kasih Sudah Memesan :-)")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent home = new Intent(menu_minuman.this, MainActivity.class);
                        startActivity(home);
                    }
                });
        AlertDialog popup = popesan.create();
        popup.show();
    }
}