package com.example.ymenesesr.entreglabegerman;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class AdaptadorRecycler extends RecyclerView.Adapter<viewHolder> {

    List<fuente> listaObjeto;

    public AdaptadorRecycler(List<fuente> listaObjeto) {
        this.listaObjeto = listaObjeto;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carditem,viewGroup,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        viewHolder.titulo.setText(listaObjeto.get(i).getTitulo());
        viewHolder.imagen.setImageResource(listaObjeto.get(i).getImagen());

    }

    @Override
    public int getItemCount() {
        return listaObjeto.size();
    }
}
