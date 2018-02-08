package com.wildantamvan.kartukontrol2.feature;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Logindelete extends AppCompatActivity {
    EditText password;
    String[] daftar;
    ListView ListView01;
    Menu menu;
    protected Cursor cursor;
    DataHelper dbcenter;
    public static MainActivity ma;

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logindelete);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String passwordKey = password.getText().toString();

                if (passwordKey.equals("123")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(),"LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();


                    Intent intent = new Intent(Logindelete.this, MainActivity.class);
                    Logindelete.this.startActivity(intent);
                    finish();
                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(Logindelete.this);
                    builder.setMessage("Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                }
            }

        });    }
}
