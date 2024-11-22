/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
/**
 *
 * @author USER
 */
public class Videojuego {
    private int id;
    private String nombre;
    private double precio;
    private String genero;
    private String plataforma;

    // Constructor
    public Videojuego(int id, String nombre, double precio, String genero, String plataforma) {
        // .isEmpty para verificar si una cadena de texto esta vacia
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del videojuego no puede estar vacío.");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero.");
        }
        if (genero == null || genero.isEmpty()) {
            throw new IllegalArgumentException("El género no puede estar vacío.");
        }
        if (plataforma == null || plataforma.isEmpty()) {
            throw new IllegalArgumentException("La plataforma no puede estar vacía.");
        }

        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
        this.plataforma = plataforma;
    }

    // Métodos getter
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    // Método toString para representar el objeto
    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Precio: Q%.2f | Género: %s | Plataforma: %s", 
                             id, nombre, precio, genero, plataforma);
    }
}
