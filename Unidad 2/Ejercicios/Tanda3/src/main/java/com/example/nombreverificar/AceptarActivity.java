package com.example.nombreverificar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AceptarActivity extends AppCompatActivity {

    private EditText saludolbl;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            saludolbl = findViewById(R.id.saludoNombrelbl);
            escribirSaludoNombre();

    }

    public void escribirSaludoNombre(){
        Bundle datos = getIntent().getExtras();
        String nom = datos.getString("nombre");
        String ape = datos.getString("apellidos");
        saludolbl.setText("Hola "+nom+" "+ape+" ¿Aceptas las condiciones?");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1)
    }
}
