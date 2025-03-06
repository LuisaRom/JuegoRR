package org.example;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> jugadores = new ArrayList<>();

        System.out.println("BIENVENIDO JUEGO RULETA RUSA");
        System.out.println("Numero de Jugadores:");
        int numJugadores = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Nombre jugadores:" + (i+1));
            jugadores.add(scanner.nextLine());
        }

    }

    RuletaRusa juegos = new RuletaRusa();
    boolean finjuego = false;

    while (!finjuego) {
        System.out.println("Participantes vivos:" + juegos.getJugadores());
        System.out.println("Posicion bala:" + juegos.getPosicionReal());

        System.out.println("Número del jugador a disparar (de 0 a " + (juegos.getJugadores().size() - 1) + "): ");
        int jugadorIndex = Scanner.nextInt();


        if (jugadorIndex < 0 || jugadorIndex >= juegos.getJugadores().size()){
            System.out.println("Jugador no valido");
        }

        finjuego = juegos.disparo(jugadorIndex);

    }



}