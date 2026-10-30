package colas;

/**
 * Laboratorio Colas-Nodo
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 30/10/2026
 */
public class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}