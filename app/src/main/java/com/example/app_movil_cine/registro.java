package com.example.app_movil_cine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        ImageView btnRegistro;

        TextView contrasena, correo, usuario;

        CheckBox check1, check2, check3, check4, check5, check6, check7, check8, check9, check10,
                check11, check12, check13, check14, check15, check16, check17, check18, check19;


        List<CheckBox> checkBoxes = new ArrayList<>();

        btnRegistro = findViewById(R.id.imageView2);
        usuario = findViewById(R.id.editTextText);
        contrasena = findViewById(R.id.editTextText2);
        correo = findViewById(R.id.editTextText3);
        check1 = findViewById(R.id.checkBox);
        checkBoxes.add(check1);
        check2 = findViewById(R.id.checkBox2);
        checkBoxes.add(check2);
        check3 =findViewById(R.id.checkBox3);
        checkBoxes.add(check3);
        check4 = findViewById(R.id.checkBox4);
        checkBoxes.add(check4);
        check5 =findViewById(R.id.checkBox5);
        checkBoxes.add(check5);
        check6 = findViewById(R.id.checkBox6);
        checkBoxes.add(check6);
        check7 =findViewById(R.id.checkBox7);
        checkBoxes.add(check7);
        check8 = findViewById(R.id.checkBox8);
        checkBoxes.add(check8);
        check9 =findViewById(R.id.checkBox9);
        checkBoxes.add(check9);
        check10 = findViewById(R.id.checkBox10);
        checkBoxes.add(check10);
        check11 =findViewById(R.id.checkBox11);
        checkBoxes.add(check11);
        check12 = findViewById(R.id.checkBox12);
        checkBoxes.add(check12);
        check13 =findViewById(R.id.checkBox13);
        checkBoxes.add(check13);
        check14 = findViewById(R.id.checkBox14);
        checkBoxes.add(check14);
        check15 =findViewById(R.id.checkBox15);
        checkBoxes.add(check15);
        check16 = findViewById(R.id.checkBox16);
        checkBoxes.add(check16);
        check17 =findViewById(R.id.checkBox17);
        checkBoxes.add(check17);
        check18 = findViewById(R.id.checkBox18);
        checkBoxes.add(check18);
        check19 = findViewById(R.id.checkBox19);
        checkBoxes.add(check19);



        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enviar;

                for (int i = 0; i < checkBoxes.size(); i++) {
                    boolean isChecked = checkBoxes.get(i).isChecked();
                    String checkBoxText = checkBoxes.get(i).getText().toString();

                    // Realiza acciones basadas en el valor del CheckBox
                    if (isChecked) {
                        enviar = checkBoxText;
                        Log.i(this.toString(),"Se hizo click en el registro");
                        Log.i(this.toString(), enviar);
                        Log.i(this.toString(),usuario.getText().toString());
                        Log.i(this.toString(),contrasena.getText().toString());
                        Log.i(this.toString(),correo.getText().toString());
                        break;
                    }
                }

            }
        });
    }
}