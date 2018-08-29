package com.example.ymenesesr.entreglabegerman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detalleActivity extends AppCompatActivity {

    ImageView imagen;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        imagen = (ImageView)findViewById(R.id.imageDetalle);
        titulo = (TextView)findViewById(R.id.textDetalle);

        DatosGridView obj = (DatosGridView)getIntent().getExtras().getSerializable("objeto");
        imagen.setImageResource(obj.getImagen());
        titulo.setText(obj.getTitulo().toString());
    }
}
