package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnsuma, btnresta, btnmulti, btndiv;
    EditText txtn1, txtn2;
    TextView txtres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtres = (TextView) findViewById(R.id.txtres);

        txtn1 = (EditText) findViewById(R.id.txtn1);
        txtn2 = (EditText) findViewById(R.id.txtn2);

        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtres.setText( suma( Integer.parseInt(txtn1.getText().toString()),Integer.parseInt(txtn2.getText().toString()) )+"");
                Intent intent = new Intent(getApplicationContext(), ActivityRespuesta.class);
                intent.putExtra("res", txtres.getText().toString());
                startActivity(intent);
                ClearScreen();
            }
        });

        btnresta = (Button) findViewById(R.id.btnresta);
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtres.setText( resta( Integer.parseInt(txtn1.getText().toString()),Integer.parseInt(txtn2.getText().toString()) )+"");
                Intent intent = new Intent(getApplicationContext(), ActivityRespuesta.class);
                intent.putExtra("res", txtres.getText().toString());
                startActivity(intent);
                ClearScreen();
            }
        });

        btnmulti = (Button) findViewById(R.id.btnmulti);
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtres.setText( multiplicacion( Integer.parseInt(txtn1.getText().toString()),Integer.parseInt(txtn2.getText().toString()) )+"");
                Intent intent = new Intent(getApplicationContext(), ActivityRespuesta.class);
                intent.putExtra("res", txtres.getText().toString());
                startActivity(intent);
                ClearScreen();
            }
        });

        btndiv = (Button) findViewById(R.id.btndiv);
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtres.setText( division( Integer.parseInt(txtn1.getText().toString()),Integer.parseInt(txtn2.getText().toString()) )+"");
                Intent intent = new Intent(getApplicationContext(), ActivityRespuesta.class);
                intent.putExtra("res", txtres.getText().toString());
                startActivity(intent);
                ClearScreen();
            }
        });




    }

    private void ClearScreen() {
        txtres.setText("");
        txtn1.setText("");
        txtn2.setText("");
    }

    public int suma (int a, int b)
    {
        return a+b;
    }

    public int resta (int a, int b)
    {
        return a-b;
    }

    public int multiplicacion (int a, int b)
    {
        return a*b;
    }

    public int division (int a, int b)
    {
        int txtres = 0;

        if (b!=0){
            txtres=a/b;
        }

        return txtres;
    }



}