package com.example.postresfitness;

import java.util.ArrayList;
import java.util.List;

public class Postre {
    int id;
    String nombre;
    String descipcion;
    String ingredientes;
    String preparacion;
    int imagen;

    public Postre(int id, String nombre, String descipcion, String ingredientes, String preparacion, int imagen) {
        this.id = id;
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "ListaPostres{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descipcion='" + descipcion + '\'' +
                ", ingredientes='" + ingredientes + '\'' +
                ", preparacion='" + preparacion + '\'' +
                ", imagen=" + imagen +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public static List<Postre> getDessert() {
        List<Postre> listado = new ArrayList<>();
        listado.add(new Postre(1, "pan de banana","banana y pan","banana, harina","mesclar banana con harina",1 ));
        listado.add(new Postre(2, "cheese cake","postre de queso y frutas","frutas ,harina, queso , leche condensada","mesclar queso con la leche condensada,2 ));
        listado.add(new Postre(3, "pan de banana","banana y pan","banana, harina","mesclar banana con harina",3 ));
        return listado;
    }
}
