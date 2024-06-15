package Modelo;

import java.io.Serializable;

public class Friend implements Serializable {
    private int id;
    private String nombre;

    public Friend(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Friend() {
        id=0;
        nombre="";
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
