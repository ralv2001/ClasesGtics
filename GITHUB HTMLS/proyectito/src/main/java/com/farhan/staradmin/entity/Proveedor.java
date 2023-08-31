package com.farhan.staradmin.entity;

public class Proveedor {

    private int id;
    private String foto;
    private String nombre;
    private String slogan;

    public Proveedor(int id, String foto, String nombre, String slogan) {
        this.id = id;
        this.foto = foto;
        this.nombre = nombre;
        this.slogan = slogan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}
