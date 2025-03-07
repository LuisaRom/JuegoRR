package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> jugadores = new ArrayList<>();

        System.out.println("BIENVENIDO AL JUEGO RULETA RUSA");
        System.out.print("Número de jugadores: ");
        int numJugadores = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea restante

        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Nombre del jugador " + (i + 1) + ": ");
            jugadores.add(scanner.nextLine());
        }

        RuletaRusa juegos = new RuletaRusa(jugadores);
        boolean finJuego = false;

        while (!finJuego) {
            System.out.println("\nParticipantes vivos: " + juegos.getJugadores());
            System.out.println("Posición de la bala: " + juegos.getPosicionReal());
            int jugadorIndex;

            do {
                System.out.print("Número del jugador a disparar (de 0 a " + (juegos.getJugadores().size() - 1) + "): ");
                jugadorIndex = scanner.nextInt();
                scanner.nextLine(); // Consumir la línea restante

                if (jugadorIndex < 0 || jugadorIndex >= juegos.getJugadores().size()) {
                    System.out.println("Jugador no válido. Intenta de nuevo.");
                }
            } while (jugadorIndex < 0 || jugadorIndex >= juegos.getJugadores().size());

            finJuego = juegos.disparo(jugadorIndex);
        }

        System.out.println("El juego ha terminado.");
        scanner.close();
    }
}
