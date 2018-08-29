package com.example.ymenesesr.entreglabegerman;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class viewHolder extends RecyclerView.ViewHolder {

    Button btn1;
    Button btn2;
    ImageView imagen;
    TextView titulo;

    public viewHolder(@NonNull View itemView) {
        super(itemView);

        btn1 = (Button) itemView.findViewById(R.id.btn1);
        btn2 = (Button) itemView.findViewById(R.id.btn2);
        imagen = (ImageView) itemView.findViewById(R.id.imagen);
        titulo = (TextView) itemView.findViewById(R.id.texto);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
