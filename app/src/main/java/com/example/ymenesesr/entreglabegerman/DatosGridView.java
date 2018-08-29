package com.example.ymenesesr.entreglabegerman;

import java.io.Serializable;

public class DatosGridView implements Serializable{
    private int id;
    private int imagen;
    private String titulo;

    public DatosGridView(int id, int imagen, String titulo) {
        this.id = id;
        this.imagen = imagen;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
