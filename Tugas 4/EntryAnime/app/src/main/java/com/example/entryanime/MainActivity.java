package com.example.entryanime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    public String daftar_anime[]={"Tensei Shitara Slime Datta Ken", "Kimetsu No Yaiba", "Tate No Yuusha", "Kimi No Nawa"};

    Spinner combo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.listanime);
        combo=(Spinner) findViewById(R.id.comboanime);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,daftar_anime);
        listView.setAdapter(adapter);
        combo.setAdapter(adapter);
    }
}