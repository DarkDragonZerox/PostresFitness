package com.example.postresfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
private RecyclerView recicler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recicler=(RecyclerView)findViewById(R.id.recicler);
        PostresFitnessAdapter adapter= new PostresFitnessAdapter(this, Postre.getDessert(),this);
        recicler.setAdapter(PostresFitnessAdapter);

    }
}