package com.example.myrecyclerview;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Persona  implements Serializable  {

    String nombre;
    String edad;
    int foto;
    String descripcion;

    public Persona(String nombre, String edad, int foto, String descripcion) {
        this.nombre = nombre;
        this.edad = edad;
        this.foto = foto;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
