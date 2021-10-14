package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
    EditText angk1, angk2;
    TextView hasil;
    Button tambahbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        angk1 = (EditText) findViewById(R.id.angka1);
        angk2 = (EditText) findViewById(R.id.angka2);
        hasil = (TextView) findViewById(R.id.hasil);
        tambahbtn = (Button) findViewById(R.id.menghitung);

        tambahbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a1 = Integer.parseInt(angk1.getText().toString());
                int a2 = Integer.parseInt(angk2.getText().toString());
                Integer hasill = a1 + a2;
                hasil.setText(hasill.toString());
            }
        });
    }
}