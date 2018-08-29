package com.example.ymenesesr.entreglabegerman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.io.Serializable;
import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    GridView grilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        grilla = (GridView) findViewById(R.id.grilla);

        ArrayList<DatosGridView> datos = new ArrayList<DatosGridView>();
        datos.add(new DatosGridView(1, R.drawable.cebra, "Cebra"));
        datos.add(new DatosGridView(2, R.drawable.caballo, "Caballo"));
        datos.add(new DatosGridView(3, R.drawable.leon, "Leon"));
        datos.add(new DatosGridView(4, R.drawable.aguila, "Aguila"));
        datos.add(new DatosGridView(5, R.drawable.cocodrilo, "Cocodrilo"));
        datos.add(new DatosGridView(6, R.drawable.aguila, "Aguila"));
        datos.add(new DatosGridView(7, R.drawable.caballo, "Caballo"));
        datos.add(new DatosGridView(8, R.drawable.cabra, "Cabra"));
        datos.add(new DatosGridView(9, R.drawable.elefante, "Elefante"));
        datos.add(new DatosGridView(10, R.drawable.jirafa, "Jirafa"));
        datos.add(new DatosGridView(11, R.drawable.guepardo, "Guepardo"));
        datos.add(new DatosGridView(12, R.drawable.leon, "Leon"));


        AdaptadorGridView miAdaptadorGrid = new AdaptadorGridView(getApplicationContext(), datos);
        grilla.setAdapter(miAdaptadorGrid);

        grilla.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DatosGridView obj = (DatosGridView) adapterView.getItemAtPosition(i);
                Intent paso = new Intent(getApplicationContext(),detalleActivity.class);
                paso.putExtra("objeto",(Serializable)obj);
                startActivity(paso);
            }
        });


    }
}
