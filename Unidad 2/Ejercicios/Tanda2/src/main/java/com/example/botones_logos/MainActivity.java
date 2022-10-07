package com.example.botones_logos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button bingbtn;
    private Button goglebtn;
    private ImageView navimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navimg = findViewById(R.id.navimg);
        bingbtn = findViewById(R.id.bingbtn);
        bingbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                navimg.setImageResource(R.drawable.);
            }
        });
    }
}