package com.example.ymenesesr.entreglabegerman;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context context;
    List<Datos> ListaObjetos;

    public Adaptador(Context context, List<Datos> listaObejtos) {
        this.context = context;
        ListaObjetos = listaObejtos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size();
    }

    @Override
    public Object getItem(int i) {
        return ListaObjetos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return ListaObjetos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista = view;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        vista = layoutInflater.inflate(R.layout.list_item_listview,null);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imageView);
        TextView titulo = (TextView) vista.findViewById(R.id.textTitulo);
        TextView detalle = (TextView) vista.findViewById(R.id.textDetalle);

        titulo.setText(ListaObjetos.get(i).getTitulo().toString());
        detalle.setText(ListaObjetos.get(i).getDetalle().toString());
        imagen.setImageResource(ListaObjetos.get(i).getImagen());

        return vista;
    }
}
