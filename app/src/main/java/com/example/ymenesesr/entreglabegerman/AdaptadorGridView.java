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

public class AdaptadorGridView extends BaseAdapter {

    private Context context;
    private List<DatosGridView> lista;

    public AdaptadorGridView(Context context, List<DatosGridView> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return lista.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.griditem, null);

        ImageView imagen = (ImageView) view.findViewById(R.id.imgPicture);
        TextView titulo = (TextView) view.findViewById(R.id.txtTitulo);
        titulo.setText(lista.get(i).getTitulo().toString());
        imagen.setImageResource(lista.get(i).getImagen());

        return view;

    }
}
