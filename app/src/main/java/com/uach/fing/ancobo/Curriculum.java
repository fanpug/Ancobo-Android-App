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
        String identifier = getIntent().getStringExtra("identifier");
        setContentView(R.layout.activity_curriculum);
        TextView txt_name = findViewById(R.id.txt_name);

        txt_name.setText("Default Namee");

    }
}