package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityRespuesta extends AppCompatActivity {

    TextView resp;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);

        resp = (TextView) findViewById(R.id.resp);

        String res = getIntent().getStringExtra("res");
        resp.setText("Resultado: " + res);


    }

}



