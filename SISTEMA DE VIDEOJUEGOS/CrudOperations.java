/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
/**
 *
 * @author USER
 */
import java.util.List;

public interface CrudOperations<T> {
    void agregar(T item);
    List<T> consultarTodos();
    T buscarPorId(int id);
    List<T> buscarPorFiltro(String filtro);
    void actualizar(int id, T item);
    void eliminar(int id);
}
