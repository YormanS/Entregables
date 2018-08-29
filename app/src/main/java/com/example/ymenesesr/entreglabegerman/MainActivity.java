package com.example.ymenesesr.entreglabegerman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Datos> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.listView);
        lista = new ArrayList<Datos>();
        lista.add(new Datos("Animal en peligro", 1, R.drawable.aguila, "Aguila"));
        lista.add(new Datos("Animal en peligro", 2, R.drawable.cocodrilo, "Cocodrilo"));
        lista.add(new Datos("Animal en peligro", 3, R.drawable.guepardo, "Guepardo"));
        lista.add(new Datos("Animal en peligro", 4, R.drawable.leon, "Leon"));
        lista.add(new Datos("Animal en peligro", 5, R.drawable.cabra, "Cabra"));
        lista.add(new Datos("Paisaje", 6, R.drawable.paisaje1, "Paisaje"));
        lista.add(new Datos("Animal en peligro", 7, R.drawable.cabra, "Cabra"));
        lista.add(new Datos("Animal en peligro", 8, R.drawable.caballo, "Caballo"));
        lista.add(new Datos("Animal en peligro", 9, R.drawable.cebra, "Cebra"));
        lista.add(new Datos("Logo de youtube", 10, R.drawable.elefante, "Elefante"));

//        FORMA 1
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_listview, nombres);
//        listView.setAdapter(adapter);

        Adaptador miadaptador = new Adaptador(getApplicationContext(), lista);
        listView.setAdapter(miadaptador);


    }

    //    METODO PARA EL MENU OVERFLOW
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    //FUNCIONES DE LOS ITEMS DEL MENU
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.itemGridView) {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);

        } else if (id == R.id.itemReciclerView) {
            Intent intent = new Intent(this, Main3Activity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }


}
