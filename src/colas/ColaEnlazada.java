package colas;

/**
 * Laboratorio Colas-ColaEnlazada
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 30/10/2026
 */
public class ColaEnlazada<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamanio;

    public ColaEnlazada() {
        this.frente = null;
        this.fin = null;
        this.tamanio = 0;
    }

    // Paso 2.2. Métodos estaVacia y tamanio
    public boolean estaVacia() {
        return frente == null;
    }

    public int tamanio() {
        return tamanio;
    }

    // Paso 2.3. Método encolar
    public void encolar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (estaVacia()) {
            frente = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamanio++;
    }

    // Paso 2.4. Método desencolar
    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null; // la cola quedó vacía
        }
        tamanio--;
        return valor;
    }

    // Paso 2.5. Método frente
    public T frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }
}