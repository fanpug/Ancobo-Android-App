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

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.Console;

public class Curriculum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int identifier = Integer.parseInt(getIntent().getStringExtra("identifier"));
        setContentView(R.layout.activity_curriculum);

        //Variables para cambiar el texto del curriculum
        TextView txt_name = findViewById(R.id.txt_name);
        TextView txt_profession = findViewById(R.id.txt_profession);
        TextView txt_about_me_description = findViewById(R.id.txt_about_me_description);
        TextView txt_education_description = findViewById(R.id.txt_education_description);
        TextView txt_skills_description = findViewById(R.id.txt_skills_description);

        //Switch para cambiar la informacion acorde al boton
        switch(identifier){
            case R.id.btn_humberto:

                break;

            case R.id.btn_sergio:

                break;

            case R.id.btn_kevin:

                break;
        }

    }
}