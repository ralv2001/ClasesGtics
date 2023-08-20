package com.example.clase1gtics.entity;

//VAMOS A CREAR UNA ENTIDAD, ES DECIR, UNA PERSONA

public class Persona {
    //CREAMOS SUS ATRIBUTOS, EN ESTE CASO, SOLO TENDRÁ nombre y apellido
    private String nombre;
    private String apellido;


    //AHORA CREAMOS SUS GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
