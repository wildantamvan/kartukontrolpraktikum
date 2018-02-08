package com.wildantamvan.kartukontrol2.feature;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Loginact extends Activity {
    EditText password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginact);
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
                    Intent intent = new Intent(Loginact.this, BuatKarkon.class);
                    Loginact.this.startActivity(intent);
                    finish();
                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(Loginact.this);
                    builder.setMessage("Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                }
            }

        });

    }
}



