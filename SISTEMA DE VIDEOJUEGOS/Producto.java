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
public abstract class Producto {
    private final int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        if (id <= 0) {
            throw new IllegalArgumentException("El ID debe ser un número positivo.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a cero.");
        }
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a cero.");
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Precio: $" + precio;
    }
}
