package com.example.ymenesesr.entreglabegerman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        ArrayList<fuente> lista = new ArrayList<fuente>();
        lista.add(new fuente("Iamgen numero 1", R.drawable.lugar1, 0));
        lista.add(new fuente("Iamgen numero 2", R.drawable.lugar2, 0));
        lista.add(new fuente("Iamgen numero 3", R.drawable.lugar3, 0));
        lista.add(new fuente("Iamgen numero 4", R.drawable.lugar4, 0));
        lista.add(new fuente("Iamgen numero 5", R.drawable.lugar5, 0));
        lista.add(new fuente("Iamgen numero 6", R.drawable.paisaje1, 0));

        RecyclerView contenedor = (RecyclerView) findViewById(R.id.contenedor);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new AdaptadorRecycler(lista));
        contenedor.setLayoutManager(layoutManager);

    }
}
