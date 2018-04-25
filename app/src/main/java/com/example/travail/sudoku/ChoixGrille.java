package com.example.travail.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChoixGrille extends AppCompatActivity {
    private int level;
    private ListView listView;
    private vGrille[] listGrilles = new vGrille[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_grille);

        level = getIntent().getIntExtra("niveau", 0);
        listGrilles = this.generateGrilles();
        listView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<vGrille> adapter = new ArrayAdapter<vGrille>(ChoixGrille.this,
                android.R.layout.simple_list_item_2, android.R.id.text1, listGrilles){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = (TextView) view.findViewById(android.R.id.text1);
                TextView text2 = (TextView) view.findViewById(android.R.id.text2);
                text1.setText(getItem(position).getNum() + " Niveau:" + getItem(position).getLevel());
                text2.setText("0%");
                return view;
            }
        };


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                openGrille();
            }
        });

    }
    public void openGrille(){
        Intent intent = new Intent(this, Grille.class);
        startActivity(intent);
    }

    public vGrille[] generateGrilles(){
        vGrille[] listGrilles = new vGrille[100];
        vGrille grille;
        for(int i = 0; i<100; i++){
            grille = new vGrille(this.level,i,0);
            listGrilles[i] = grille;
        }
        return listGrilles;
    }
}
