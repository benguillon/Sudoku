package com.example.travail.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoixNiveau extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.niveau1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openChoixGrille(1);
            }
        });

        button2 = (Button) findViewById(R.id.niveau2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openChoixGrille(2);
            }
        });

        button3 = (Button) findViewById(R.id.niveau3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openChoixGrille(3);
            }
        });

    }

    public void openChoixGrille(int niveau){
        Intent intent = new Intent(this, ChoixGrille.class);
        intent.putExtra("niveau", niveau);
        startActivity(intent);
    }
}
