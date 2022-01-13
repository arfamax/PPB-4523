package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class detail_minuman extends AppCompatActivity {

    // kamus variable
    private Button pilih;
    private ListView listView;
    private TextView nm_minuman;
    private db_keranjang dbkr;

    ArrayAdapter adapter;
    ArrayList<String> list_pilihan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_minuman);

        listView = findViewById(R.id.daftar_pesanan);
        nm_minuman = findViewById(R.id.nama_mnuman);
        dbkr = new db_keranjang(this);

        list_pilihan = new ArrayList<>();

        // tombol untuk popup setelah memilih
        pilih = (Button) findViewById(R.id.pilihminum);

        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbkr.tambahData(nm_minuman.getText().toString());
                popuppilih();
            }
        });
    }
    private void popuppilih(){
        AlertDialog.Builder popup = new AlertDialog.Builder(this);
        popup.setTitle("Berhasil!");

        popup
                .setMessage("Berhasil memasukan pilihan!")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent pilih = new Intent(detail_minuman.this, menu_minuman.class);
                        startActivity(pilih);
                    }
                });
        AlertDialog popupp = popup.create();
        popupp.show();
    }
}