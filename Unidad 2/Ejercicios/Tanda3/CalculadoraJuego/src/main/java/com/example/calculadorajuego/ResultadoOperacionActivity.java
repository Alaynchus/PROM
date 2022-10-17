package com.example.calculadorajuego;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoOperacionActivity extends AppCompatActivity {

    private TextView respresulbl;
    private Boolean esCorrecta;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_operacion);

        respresulbl= findViewById(R.id.respuestaresultadolbl);
        esCorrecta=acertada();
        compresul();
    }

    public boolean acertada(){
        Bundle datos = getIntent().getExtras();
        int nu1 = datos.getInt("nu1");
        int nu2 = datos.getInt("nu2");
        int resulcom = datos.getInt("resulcom");
        if(nu1+nu2==resulcom)
            return true;
        else
            return false;
    }

    public void compresul(){
        if(acertada()==true){
            respresulbl.setText("El resultado de la operacion es CORRECTA");
        }
        else{
            respresulbl.setText("El resultado de la operacion es INCORRECTA");
        }
    }

    public void listenerVorlverbtn(View view){
        Intent intent= new Intent();
        intent.putExtra("esCorrecta", esCorrecta);
        setResult(RESULT_OK, intent);
        finish();
    }

}
