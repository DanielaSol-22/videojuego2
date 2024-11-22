/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;
/**
 *
 * @author USER
 */
import interfaces.CrudOperations;
import models.Videojuego;

import java.util.*;
import java.util.stream.Collectors;

import java.util.List;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoVideojuegos {
    private List<Videojuego> listaVideojuegos = new ArrayList<>();

    // Método para agregar un videojuego al catálogo
    public void agregarVideojuego(Videojuego videojuego) {
        if (videojuego == null) {
            throw new IllegalArgumentException("El videojuego no puede ser nulo.");
        }
        listaVideojuegos.add(videojuego);
    }

    // Método para obtener todos los videojuegos
    public List<Videojuego> obtenerTodos() {
        return new ArrayList<>(listaVideojuegos);
    }

    // Buscar videojuegos por género o plataforma (sin importar mayúsculas)
    public List<Videojuego> buscarPorCriterio(String criterio) {
        return listaVideojuegos.stream()
                .filter(v -> v.getGenero().equalsIgnoreCase(criterio) || v.getPlataforma().equalsIgnoreCase(criterio))
                .collect(Collectors.toList());
    }

    // Filtrar videojuegos por un rango de precios
    public List<Videojuego> filtrarPorPrecio(double precioMin, double precioMax) {
        return listaVideojuegos.stream()
                .filter(v -> v.getPrecio() >= precioMin && v.getPrecio() <= precioMax)
                .collect(Collectors.toList());
    }

    // Contar la cantidad de videojuegos en el catálogo
    public long contarVideojuegos() {
        return listaVideojuegos.size();
    }
}
