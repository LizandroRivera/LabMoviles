package com.example.guia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button datos;
    private Button sesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.calculadora);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCalculadora();
            }
        });

        datos = findViewById(R.id.datos);
        datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirDatos();
            }
        });

        sesion = findViewById(R.id.formulario);
        sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirSesion();
            }
        });
    }

    public void abrirCalculadora(){
        Intent intent = new Intent(this, calculadora.class);
        startActivity(intent);
    }

    public void abrirDatos(){
        Intent intent = new Intent(this, datos.class);
        startActivity(intent);
    }

    public void abrirSesion(){
        Intent intent = new Intent(this, sesion.class);
        startActivity(intent);
    }
}
