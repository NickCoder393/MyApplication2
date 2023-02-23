package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.BreakIterator;

public class menuActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button buttonIrCadastro;

        buttonIrCadastro=findViewById(R.id.buttonIrCadastro);

        buttonIrCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(menuActivity.this, cadastroActivity.class);


                BreakIterator etNome;
                in.putExtra("nome", etNome.getText().toString());
                BreakIterator etEmail;
                in.putExtra("email", etEmail.getText().toString());
                BreakIterator etCpf;
                in.putExtra("cpf", etCpf.getText().toString());

                String nome = in.getStringExtra("nome");
                String email = in.getStringExtra("email");

                startActivity(in);
            }
        });

    }
}