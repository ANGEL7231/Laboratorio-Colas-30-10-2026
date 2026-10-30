package colas;

/**
 * Laboratorio Colas
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 30/10/2026
 */

import java.util.ArrayDeque; 
import java.util.LinkedList; 
import java.util.Queue; 


public class Main { 
 public static void main(String[] args) { 
 System.out.println("Entorno listo"); 

/**ColaArreglo cola = new ColaArreglo(3); 
*cola.encolar(10); 
*cola.encolar(20); 
*cola.encolar(30); 
*System.out.println("Sale: " + cola.desencolar()); // 10 
*cola.encolar(40); // reutiliza la posición 0
*System.out.println("Frente: " + cola.frente()); // 20 
*System.out.println("Tamaño: " + cola.tamanio()); // 3 
*System.out.println("¿Llena? " + cola.estaLlena()); // true  
*/

//Probar con genericos 2.6
ColaEnlazada<String> nombres = new ColaEnlazada<>(); 
nombres.encolar("Ana"); 
nombres.encolar("Luis"); 
nombres.encolar("María"); 
System.out.println(nombres.desencolar()); // Ana 
System.out.println(nombres.frente()); // Luis 
System.out.println(nombres.tamanio()); // 2 

//Parte 3.1
Queue<String> cola = new LinkedList<>(); 
// Prueba también: Queue<String> cola = new ArrayDeque<>(); 
cola.offer("Ana"); 
cola.offer("Luis"); 
cola.offer("María"); 
System.out.println(cola.peek()); // Ana (no la elimina) 
System.out.println(cola.poll()); // Ana (la elimina) 
System.out.println(cola.size()); // 2 
System.out.println(cola); // [Luis, María]


//3.2
Queue<String> colaVacia = new LinkedList<>();

// Descomenta uno por uno para probarlos:
// System.out.println(colaVacia.remove());   // Lanza excepción
// System.out.println(colaVacia.poll());     // Imprime null
// System.out.println(colaVacia.element());  // Lanza excepción
// System.out.println(colaVacia.peek());     // Imprime null


//3.3
Queue<Integer> pq = new java.util.PriorityQueue<>(); 
pq.offer(30); 
pq.offer(10); 
pq.offer(20); 
System.out.println(pq.poll()); // ¿Qué valor sale primero? 
System.out.println(pq.poll()); 
System.out.println(pq.poll()); 

// Pruebas de los ejercicios de refuerzo en Main.java
        ColaEnlazada<String> colaRefuerzo = new ColaEnlazada<>();
        colaRefuerzo.encolar("Carlos");
        colaRefuerzo.encolar("Sofía");
        colaRefuerzo.encolar("Miguel");

        // 1. Probar imprimirCola() (muestra los elementos sin destruirlos)
        colaRefuerzo.imprimirCola(); 
        // Imprimirá: Cola (Frente a Final): [ Carlos Sofía Miguel ]

        System.out.println("Tamaño antes de vaciar: " + colaRefuerzo.tamanio()); // Imprime 3

        // 2. Probar vaciar() (deja la cola sin elementos)
        colaRefuerzo.vaciar();

        System.out.println("¿Está vacía después de vaciar()? " + colaRefuerzo.estaVacia()); // Imprime true
        System.out.println("Tamaño después de vaciar: " + colaRefuerzo.tamanio()); // Imprime 0
        
        // Intentar imprimirla vacía
        colaRefuerzo.imprimirCola(); 
        // Imprimirá: La cola está vacía.

} 


} 
