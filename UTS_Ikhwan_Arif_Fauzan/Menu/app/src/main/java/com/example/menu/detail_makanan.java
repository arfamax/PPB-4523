package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detail_makanan extends AppCompatActivity {

    // Kamus variable
    Button pilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_makanan);
        // tombol untuk popup setelah memilih
        pilih = (Button) findViewById(R.id.pilihmakan);

        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                        Intent pilih = new Intent(detail_makanan.this, menu_makanan.class);
                        startActivity(pilih);
                    }
                });
        AlertDialog popupp = popup.create();
        popupp.show();
    }
}