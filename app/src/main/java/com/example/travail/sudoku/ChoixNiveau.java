package com.example.travail.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoixNiveau extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.niveau1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openChoixGrille();
            }
        });

    }

    public void openChoixGrille(){
        Intent intent = new Intent(this, ChoixGrille.class);
        startActivity(intent);
    }
}
