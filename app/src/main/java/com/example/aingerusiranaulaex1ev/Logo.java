package com.example.aingerusiranaulaex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        ImageButton imgbtnImagenLogo = findViewById(R.id.imgbtnImagenLogo);

        imgbtnImagenLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Logo.this, PaginaPrincipal.class);
                startActivity(intent);
            }
        });
    }
}