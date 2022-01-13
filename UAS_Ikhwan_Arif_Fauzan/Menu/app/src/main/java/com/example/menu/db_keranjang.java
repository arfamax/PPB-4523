package com.example.menu;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class db_keranjang extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "daftarpesanan";
    private static final int DATABASE_VERSION = 1;
    private static final String NM_PESANAN = "pesanan";
    private static final String TABLE_NAME = "daftarpesan";
    private static final String NOMER = "nomer";
    public db_keranjang(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + "(" + NOMER + " INTEGER PRIMARY KEY AUTOINCREMENT , " + NM_PESANAN+ " TEXT )";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
    }

    public boolean tambahData(String nama_pesanan){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NM_PESANAN , nama_pesanan);

        long hasil = db.insert(TABLE_NAME, null, values);
        return hasil != -1;
    }
}

