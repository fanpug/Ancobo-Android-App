package com.uach.fing.ancobo;

import com.uach.fing.ancobo.models.CurriculumData;
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
        setContentView(R.layout.activity_curriculum);

        //Variable para recibir el url del curriculum de la persona seleccionada
        String url = getIntent().getStringExtra("url");

        //Variables para cambiar el texto del curriculum
        TextView txt_name = findViewById(R.id.txt_name);
        TextView txt_profession = findViewById(R.id.txt_profession);
        TextView txt_about_me_description = findViewById(R.id.txt_about_me_description);
        TextView txt_education_description = findViewById(R.id.txt_education_description);
        TextView txt_skills_description = findViewById(R.id.txt_skills_description);

        //Request queue para obtener los datos del servidor
        RequestQueue queue = Volley.newRequestQueue(this);

        //StringRequest para hacer cosas de string request
        StringRequest sr = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        CurriculumData cv  = new Gson().fromJson(response.toString(), CurriculumData.class);
                        txt_name.setText(cv.name);
                        txt_profession.setText(cv.profession);
                        txt_about_me_description.setText(cv.aboutMe);
                        txt_education_description.setText(cv.education);
                        txt_skills_description.setText(cv.skills);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("server-request-error", error.getMessage());
                    }
                });

        queue.add(sr);

    }
}