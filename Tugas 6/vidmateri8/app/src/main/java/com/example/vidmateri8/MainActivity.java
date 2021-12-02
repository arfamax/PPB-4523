package com.example.vidmateri8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Database databs;
    ListView tampilan;
    EditText editdata;
    Button tombol;

    ArrayAdapter adapter;
    ArrayList<String> listview;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tampilan = findViewById(R.id.daftaranime);
        editdata = findViewById(R.id.dataanime);
        tombol = findViewById(R.id.tomboltmbh);
        databs = new Database(this);
        listview = new ArrayList<>();

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databs.tambahdata(editdata.getText().toString());
            }
        });

    }
}