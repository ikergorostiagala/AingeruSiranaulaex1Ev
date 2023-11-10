package com.example.aingerusiranaulaex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LugarTuristicoInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugar_turistico_info);

        ImageView imgLugarTuristicoInfo = findViewById(R.id.imgLugarTuristicoInfo);
        TextView txtLugarTuristicoTitulo = findViewById(R.id.txtLugarTuristicoTitulo);
        TextView txtLugarturisticoDescripcion = findViewById(R.id.txtLugarturisticoDescripcion);

        Button btnAtras = findViewById(R.id.btnAtras);
        Button btnAtrasFav = findViewById(R.id.btnAtrasFav);

        Intent intent = getIntent();

        if(intent != null){
            Bundle bundle = intent.getExtras();
            if(bundle != null){
                String lugar = (String) bundle.getSerializable("LugarTuristico");

                if(lugar.equals(getString(R.string.txtLugarTuristico1))){
                    txtLugarTuristicoTitulo.setText(getString(R.string.txtLugarTuristico1));
                    imgLugarTuristicoInfo.setImageDrawable(getResources().getDrawable(R.drawable.segovia));
                    txtLugarturisticoDescripcion.setText(getString(R.string.segoviaInfo));
                }else if(lugar.equals(getString(R.string.txtLugarTuristico2))){
                    txtLugarTuristicoTitulo.setText(getString(R.string.txtLugarTuristico2));
                    imgLugarTuristicoInfo.setImageDrawable(getResources().getDrawable(R.drawable.tajmahal));
                    txtLugarturisticoDescripcion.setText(getString(R.string.tajmahalInfo));
                }else if(lugar.equals(getString(R.string.txtLugarTuristico3))){
                    txtLugarTuristicoTitulo.setText(getString(R.string.txtLugarTuristico3));
                    imgLugarTuristicoInfo.setImageDrawable(getResources().getDrawable(R.drawable.japon));
                    txtLugarturisticoDescripcion.setText(getString(R.string.japonInfo));
                }else if(lugar.equals(getString(R.string.txtLugarTuristico4))){
                    txtLugarTuristicoTitulo.setText(getString(R.string.txtLugarTuristico4));
                    imgLugarTuristicoInfo.setImageDrawable(getResources().getDrawable(R.drawable.stone));
                    txtLugarturisticoDescripcion.setText(getString(R.string.stoneInfo));
                }
            }
        }

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAtras = new Intent(LugarTuristicoInfo.this, PaginaPrincipal.class);
                startActivity(intentAtras);
            }
        });

        btnAtrasFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFav = new Intent(LugarTuristicoInfo.this, PaginaPrincipal.class);
                intentFav.putExtra("fav", txtLugarTuristicoTitulo.getText().toString());
                startActivity(intentFav);
            }
        });

    }
}