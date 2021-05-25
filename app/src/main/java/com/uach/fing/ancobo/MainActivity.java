package com.uach.fing.ancobo;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para ir de una ventana de la aplicacion a otra, este caso la ventana del curriculum
    // y le pasa el id del boton que pidio el cambio de ventana
    public void goToActivityCurriculum(View view){
        int identifier = view.getId();
        Intent i = new Intent(this, Curriculum.class);
        i.putExtra("identifier", identifier);
        startActivity(i);
    }
}