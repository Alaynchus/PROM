package com.example.nombreverificar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AceptarActivity extends AppCompatActivity {

    private EditText saludolbl;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_aceptar_condiciones);

            saludolbl = findViewById(R.id.saludoNombrelbl);
            escribirSaludoNombre();

    }

    public void escribirSaludoNombre(){
        Bundle datos = getIntent().getExtras();
        String nom = datos.getString("nombre");
        String ape = datos.getString("apellidos");
        saludolbl.setText("Hola "+nom+" "+ape+" ¿Aceptas las condiciones?");
    }

    public void listenerRespuesta(View view){
        Intent intent;
        if(view.getId()==R.id.aceptarbtn){
            intent = new Intent();
            intent.putExtra("respuesta", true);
            setResult(RESULT_OK, intent);
            finish();
        }
        else{
            intent = new Intent();
            intent.putExtra("respuesta", false);
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}
