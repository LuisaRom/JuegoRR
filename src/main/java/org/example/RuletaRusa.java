package org.example;

import java.util.ArrayList;
import java.util.Random;

public class RuletaRusa {

    private ArrayList<String> jugadores;
    private int posicionReal;
    private Random random;

    public RuletaRusa(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
        this.random = new Random();
        numAleatorio();
    }

    private void numAleatorio() {
        if (!jugadores.isEmpty()) {
            posicionReal = random.nextInt(jugadores.size());
        }
    }

    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public int getPosicionReal() {
        return posicionReal;
    }

    public boolean disparo(int jugadorIndex) {
        System.out.println("El jugador " + jugadores.get(jugadorIndex) + " ha disparado...");

        if (jugadorIndex == posicionReal) {
            System.out.println("💀 " + jugadores.get(jugadorIndex) + " murió.");
            jugadores.remove(jugadorIndex);

            if (jugadores.isEmpty()) {
                System.out.println("¡No quedan jugadores! Fin del juego.");
                return true;
            }  numAleatorio();
        } else {
            System.out.println("🎉 " + jugadores.get(jugadorIndex) + " sigue vivo.");
        }

        return false;
    }
}




