package com.example.nombreverificar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombrelbl;
    private EditText apellidoslbl;
    private EditText condicioneslbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombrelbl = findViewById(R.id.nombrelbl);
        apellidoslbl = findViewById(R.id.apellidolbl);
        condicioneslbl = findViewById(R.id.resultadolbl);


    }
    public void listerverificarbtn(View view){
        String nom = nombrelbl.getText().toString();
        String ape = apellidoslbl.getText().toString();

        Intent intent = new Intent(MainActivity.this, AceptarActivity.class);
        intent.putExtra("nombre",nom);
        intent.putExtra("apellidos",ape);
        startActivityForResult(intent,1);
    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode==RESULT_OK){
            boolean respuesta=data.getExtras().getBoolean("respuesta");
            if(respuesta){
                condicioneslbl.setText("ACEPTADO");
            }
            else{
                condicioneslbl.setText("RECHAZADO");
            }
        }
    }

}