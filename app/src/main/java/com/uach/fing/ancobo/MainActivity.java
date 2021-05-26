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
        //cambiar el link de ngrok (link del archivo predeterminado)
        String url = "https://aa8d4a52d781.ngrok.io/";
        int pfp = 1;

        //Switch para cambiar la informacion acorde al boton
        switch(view.getId()){
            case R.id.btn_humberto:
                //cambiar el link de ngrok
                url = "https://aa8d4a52d781.ngrok.io/320669.json";
                pfp = 1;
                break;

            case R.id.btn_sergio:
                //cambiar el link de ngrok
                url = "https://aa8d4a52d781.ngrok.io/281854.json";
                pfp = 2;
                break;

            case R.id.btn_kevin:
                //cambiar el link de ngrok
                url = "https://aa8d4a52d781.ngrok.io/306007.json";
                pfp = 3;
                break;
            default:
        }

        Intent i = new Intent(this, Curriculum.class);
        i.putExtra("url", url);
        i.putExtra("pfp", pfp);
        startActivity(i);
    }
}