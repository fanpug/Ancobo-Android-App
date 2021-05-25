package com.uach.fing.ancobo;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para ir de una ventana de la aplicacion a otra, este caso la ventana del curriculum
    public void irPantallaCurriculum(View view){
        Intent i = new Intent(this, Curriculum.class);
        startActivity(i);
    }
}