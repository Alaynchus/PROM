package com.example.didaktikapp_zazpikaleak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sopaLetras extends AppCompatActivity {

    private final String[] letras = new String[] {
            "E","R","A","T","U","N","P","S","P","T","V","C","E","P",
            "G","U","K","M","L","E","I","O","E","B","E","B","T","C",
            "U","X","S","E","E","B","P","T","N","L","Ñ","P","U","O",
            "L","S","U","K","K","R","O","Ñ","P","M","E","O","O","L",
            "Y","M","O","M","A","F","C","L","T","P","Y","N","B","U",
            "P","Y","P","L","B","L","U","A","J","H","I","L","L","M",
            "N","B","U","P","I","N","T","X","O","S","O","Z","M","N",
            "M","Ñ","Q","N","A","S","H","X","I","I","T","X","H","A",
            "A","K","T","W","T","P","D","M","A","B","L","M","P","S",
            "R","A","R","C","O","S","L","J","M","I","W","L","E","B",
            "C","J","G","Ñ","L","E","G","Y","P","O","N","L","O","W",
            "O","T","M","S","T","T","H","R","T","U","B","D","O","M",
            "S","E","T","N","A","R","U","A","T","S","E","R","I","Ñ",
            "U","J","B","T","S","B","L","V","T","B","M","U","Z","A"
    };
    private TextView sopatxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sopa_letras);
        sopatxt=findViewById(R.id.sopaLetras);
        sopatxt.setText(escribirLetras());
    }

    private String escribirLetras(){
       String sopaMostrar="";
        for (int i = 0; i < letras.length; i++){
            sopaMostrar = sopaMostrar+letras[i];
        }

        return sopaMostrar;
    }
}
