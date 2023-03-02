package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button buttonIrSobreoJogo;
        Button buttonIrNovoJogo;
        Button buttonIrCarregarJogo;
        Button buttonIrTutorial;
        Button buttonIrConfiguracao;
        Button buttonIrDesenvolvedores;

        buttonIrSobreoJogo=findViewById(R.id.buttonIrSobreoJogo);
        buttonIrConfiguracao=findViewById(R.id.buttonIrConfiguracao);
        buttonIrTutorial= findViewById(R.id.buttonIrTutorial);
        buttonIrDesenvolvedores= findViewById(R.id.buttonIrDesenvolvedores);
        buttonIrCarregarJogo=findViewById(R.id.buttonIrCarregarJogo);
        buttonIrNovoJogo=findViewById(R.id.buttonIrNovoJogo);
        buttonIrSobreoJogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(menuActivity.this, SobreoJogo.class);
                startActivity(in);
            }
        });
        buttonIrConfiguracao.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent in = new Intent(menuActivity.this,SobreoJogo.class);
            }
        });

        buttonIrCarregarJogo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent in = new Intent(menuActivity.this,CarregarJogo.class);
            }
        });

        buttonIrTutorial.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent in = new Intent(menuActivity.this,Tutorial.class);
            }
        });

        buttonIrNovoJogo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent in = new Intent(menuActivity.this,NovoJogo.class);
            }
        });

        buttonIrDesenvolvedores.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent in = new Intent(menuActivity.this,Desenvolvedores.class);
            }
        });

    }
}