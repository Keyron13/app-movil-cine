package com.example.app_movil_cine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ImageView btnIS;
        TextView linkregistro;
        TextView contraseña;
        TextView email;

        linkregistro = findViewById(R.id.linkRegistro);
        btnIS = findViewById(R.id.imageView2);
        email = findViewById(R.id.editTextText);
        contraseña = findViewById(R.id.editTextText2);

        btnIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(this.toString(),"Se dio click");
                Log.i(this.toString(),email.getText().toString());
                Log.i(this.toString(),contraseña.getText().toString());

            }
        });
        linkregistro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), registro.class);
                startActivity(intent);
            }
        });

    }
}