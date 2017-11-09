package com.example.redapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton1, boton2, boton3, boton4,boton5,boton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = (Button) findViewById(R.id.btn);
        boton1.setOnClickListener(this);
        boton2 = (Button) findViewById(R.id.button2);
        boton2.setOnClickListener(this);
        boton3 = (Button) findViewById(R.id.button3);
        boton3.setOnClickListener(this);
        boton4 = (Button) findViewById(R.id.button4);
        boton4.setOnClickListener(this);
        boton5 = (Button) findViewById(R.id.button5);
        boton5.setOnClickListener(this);
        boton6 = (Button) findViewById(R.id.button6);
        boton6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        if(view == boton1)
        {
            i = new Intent(this,ConexionHTTP.class);
            startActivity(i);
        }
        if(view == boton2)
        {
            i = new Intent(this,ConexionAsincrona.class);
            startActivity(i);

        }
        if(view == boton3)
        {
            i = new Intent(this,ConexionAAHC.class);
            startActivity(i);

        }
        if(view == boton4)
        {
            i = new Intent(this,ConexionVolley.class);
            startActivity(i);

        }
        if(view==boton5)
        {
            i=new Intent(this,Descarga.class);
            startActivity(i);
        }
        if(view==boton6)
        {
            i=new Intent(this,Subir.class);
            startActivity(i);
        }

    }
}
