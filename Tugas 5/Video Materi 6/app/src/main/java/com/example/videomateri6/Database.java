package com.example.videomateri6;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class Database extends SQLiteOpenHelper{

    private static final String DB_ANIME = "db_anime";
    private static final String KODE = "kode";
    private static final String NAMAANIME = "nm_anime";
    private static final String TABEL_ANIME = "tabel_anime";

    public Database(@Nullable Context context) {
        super(context, DB_ANIME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String nama_tabel="create table "+TABEL_ANIME+ "(" + KODE + " integer primary key autoincrement, " + NAMAANIME + " text)";
        sqLiteDatabase.execSQL(nama_tabel);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
    }

    public boolean tambahdata(String name_anime)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(NAMAANIME, name_anime);

        long hasil=sqLiteDatabase.insert(TABEL_ANIME, null, contentValues);
        return hasil != -1;
    }

}
