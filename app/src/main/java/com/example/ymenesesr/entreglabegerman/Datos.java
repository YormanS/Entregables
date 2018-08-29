package com.example.ymenesesr.entreglabegerman;

public class Datos {
    private int id;
    private String titulo;
    private String detalle;
    private int imagen;


    public Datos(String detalle,int id,int imagen, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.detalle = detalle;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

}
