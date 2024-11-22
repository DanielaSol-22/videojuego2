/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import interfaces.CrudOperations;
import java.util.Optional;
import managers.CatalogoVideojuegos;
import models.Videojuego;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SistemaVideojuegos {
    public static void main(String[] args) {
        // Crear un nuevo catálogo de videojuegos
        CatalogoVideojuegos catalogo = new CatalogoVideojuegos();

        // Agregar algunos videojuegos al catálogo
        agregarVideojuegos(catalogo);

        // Mostrar los videojuegos de un género específico
        System.out.println("\nBuscar videojuegos por género 'Aventura':");
        mostrarVideojuegosPorGenero(catalogo, "Aventura");

        // Filtrar videojuegos por un rango de precios
        System.out.println("\nFiltrar videojuegos con precios entre Q500.00 y Q800.00:");
        mostrarVideojuegosPorPrecio(catalogo, 500.00, 800.00);

        // Mostrar todos los videojuegos del catálogo
        System.out.println("\nLista completa de videojuegos:");
        mostrarTodosLosVideojuegos(catalogo);

        // Mostrar el número total de videojuegos en el catálogo
        System.out.println("\nCantidad de videojuegos registrados: " + obtenerCantidadDeVideojuegos(catalogo));
    }

    // Método para agregar videojuegos al catálogo
    private static void agregarVideojuegos(CatalogoVideojuegos catalogo) {
        try {
            catalogo.agregarVideojuego(new Videojuego(1, "The Legend of Zelda: Tears of the Kingdom", 799.00, "Aventura", "Nintendo Switch"));
            catalogo.agregarVideojuego(new Videojuego(2, "Super Mario Bros. Wonder", 559.00, "Plataforma", "Nintendo Switch"));
            catalogo.agregarVideojuego(new Videojuego(3, "Pokémon Scarlet / Violet", 489.00, "RPG", "Nintendo Switch"));
            catalogo.agregarVideojuego(new Videojuego(4, "FIFA 24", 949.00, "Deportes", "PS5"));
            catalogo.agregarVideojuego(new Videojuego(5, "Call of Duty: Modern Warfare II", 749.00, "Acción", "PS5"));
            System.out.println("Se han agregado los videojuegos exitosamente.");
        } catch (Exception e) {
            System.out.println("[ERROR] No se pudo agregar los videojuegos: " + e.getMessage());
        }
    }

    // Método para mostrar todos los videojuegos
    private static void mostrarTodosLosVideojuegos(CatalogoVideojuegos catalogo) {
        catalogo.obtenerTodos().forEach(System.out::println);
    }

    // Método para mostrar videojuegos por género
    private static void mostrarVideojuegosPorGenero(CatalogoVideojuegos catalogo, String genero) {
        catalogo.buscarPorCriterio(genero).forEach(System.out::println);
    }

    // Método para mostrar videojuegos por rango de precio
    private static void mostrarVideojuegosPorPrecio(CatalogoVideojuegos catalogo, double precioMin, double precioMax) {
        catalogo.filtrarPorPrecio(precioMin, precioMax).forEach(System.out::println);
    }

    // Método para obtener la cantidad de videojuegos registrados
    private static long obtenerCantidadDeVideojuegos(CatalogoVideojuegos catalogo) {
        return catalogo.contarVideojuegos();
    }
}
