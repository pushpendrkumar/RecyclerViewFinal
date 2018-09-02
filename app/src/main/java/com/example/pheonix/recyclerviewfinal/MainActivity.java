package com.example.pheonix.recyclerviewfinal;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.Cursor;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.Recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] names = new String[]{"Pushpendra", "Chetan Vedi", "Dj Arjun", "Nitish Nety", "Babbu Bhai", "Shanky", "PratikTyagi", "Sardar Khan", "Faizal Khan", "Monty"};
        recyclerView.setAdapter(new MyAdapter(names));

        }
    }
