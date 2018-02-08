package com.wildantamvan.kartukontrol2.feature;



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "karkon2.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        //String sql = "create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null);";

        String sql = "create table karkon2(no integer primary key, nama text null, tglpretest text null, Pretest text null, Postest text null);";

        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
//        sql = "INSERT INTO biodata (no, nama, tgl, jk, alamat) VALUES ('1001', 'Fathur', '1994-02-03', 'Laki-laki','Jakarta');";

        sql = "INSERT INTO karkon2(no, nama, tglpretest, pretest, postest) VALUES ('1', 'wildan', '1998-04-01', '96','97');";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub

    }

}
