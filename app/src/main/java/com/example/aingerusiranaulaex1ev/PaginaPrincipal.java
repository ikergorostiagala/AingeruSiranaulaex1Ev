package com.example.aingerusiranaulaex1ev;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class PaginaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        Intent intentInfo = getIntent();

        ImageButton imgbtnImagenTuristico1 = findViewById(R.id.imgbtnImagenTuristico1);
        TextView txtLugarTuristico1 = findViewById(R.id.txtLugarTuristico1);
        TextView txtContadorLugarTuristicoNum1 = findViewById(R.id.txtContadorLugarTuristicoNum1);

        ImageButton imgbtnImagenTuristico2 = findViewById(R.id.imgbtnImagenTuristico2);
        TextView txtLugarTuristico2 = findViewById(R.id.txtLugarTuristico2);
        TextView txtContadorLugarTuristicoNum2 = findViewById(R.id.txtContadorLugarTuristicoNum2);

        ImageButton imgbtnImagenTuristico3 = findViewById(R.id.imgbtnImagenTuristico3);
        TextView txtLugarTuristico3 = findViewById(R.id.txtLugarTuristico3);
        TextView txtContadorLugarTuristicoNum3 = findViewById(R.id.txtContadorLugarTuristicoNum3);

        ImageButton imgbtnImagenTuristico4 = findViewById(R.id.imgbtnImagenTuristico4);
        TextView txtLugarTuristico4 = findViewById(R.id.txtLugarTuristico4);
        TextView txtContadorLugarTuristicoNum4 = findViewById(R.id.txtContadorLugarTuristicoNum4);

        if(intentInfo != null){
            Bundle bundle = intentInfo.getExtras();
            if(bundle != null) {
                String fav = (String) bundle.getSerializable("fav");
                int cont;
                String contador = "";
                if(fav.equals(txtLugarTuristico1.getText().toString())){
                    contador = txtContadorLugarTuristicoNum1.getText().toString();
                    cont = Integer.parseInt(contador) + 1;
                    Log.i(TAG, String.valueOf(cont));
                    txtContadorLugarTuristicoNum1.setText(String.valueOf(cont));
                }else if(fav.equals(txtLugarTuristico2.getText().toString())){
                    contador = txtContadorLugarTuristicoNum2.getText().toString();
                    cont = Integer.parseInt(contador) + 1;
                    txtContadorLugarTuristicoNum2.setText(String.valueOf(cont));
                }else if(fav.equals(txtLugarTuristico3.getText().toString())){
                    contador = txtContadorLugarTuristicoNum3.getText().toString();
                    cont = Integer.parseInt(contador) + 1;
                    txtContadorLugarTuristicoNum3.setText(String.valueOf(cont));
                }else if(fav.equals(txtLugarTuristico4.getText().toString())){
                    contador = txtContadorLugarTuristicoNum4.getText().toString();
                    cont = Integer.parseInt(contador) + 1;
                    txtContadorLugarTuristicoNum4.setText(String.valueOf(cont));
                }
            }


        }

        imgbtnImagenTuristico1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaginaPrincipal.this, LugarTuristicoInfo.class);
                intent.putExtra("LugarTuristico", txtLugarTuristico1.getText().toString());
                startActivity(intent);
            }
        });

        imgbtnImagenTuristico2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaginaPrincipal.this, LugarTuristicoInfo.class);
                intent.putExtra("LugarTuristico", txtLugarTuristico2.getText().toString());
                startActivity(intent);
            }
        });

        imgbtnImagenTuristico3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaginaPrincipal.this, LugarTuristicoInfo.class);
                intent.putExtra("LugarTuristico", txtLugarTuristico3.getText().toString());
                startActivity(intent);
            }
        });

        imgbtnImagenTuristico4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaginaPrincipal.this, LugarTuristicoInfo.class);
                intent.putExtra("LugarTuristico", txtLugarTuristico4.getText().toString());
                startActivity(intent);
            }
        });
    }
}