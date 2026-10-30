package colas;

/**
 * Laboratorio Colas - Simulación de Fila de Banco
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 30/10/2026
 */

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        ColaEnlazada<String> fila = new ColaEnlazada<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE FILA DE BANCO ---");
            System.out.println("1. Llega un cliente");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Ver quién sigue");
            System.out.println("4. Ver cantidad en espera");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    // TODO: pedir el nombre y encolarlo
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = sc.nextLine();
                    fila.encolar(nombre);
                    System.out.println("¡Cliente " + nombre + " agregado a la fila!");
                    break;

                case 2:
                    // TODO: desencolar (validar que no esté vacía)
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera[cite: 10].");
                    } else {
                        String atendido = fila.desencolar();
                        System.out.println("Atendiendo a: " + atendido);
                    }
                    break;

                case 3:
                    // TODO: mostrar el frente (validar que no esté vacía)[cite: 9]
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera[cite: 10].");
                    } else {
                        System.out.println("El siguiente en la fila es: " + fila.frente());
                    }
                    break;

                case 4:
                    // TODO: mostrar el tamaño[cite: 9]
                    System.out.println("Clientes en espera: " + fila.tamanio());
                    break;

                case 5:
                    System.out.println("Saliendo del sistema de banco...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

        sc.close();
    }
}