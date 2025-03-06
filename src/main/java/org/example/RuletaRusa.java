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

    public RuletaRusa() {
    }

    public RuletaRusa(ArrayList<String> jugadores, int posicionReal, Random random) {
        this.jugadores = jugadores;
        this.posicionReal = posicionReal;
        this.random = random;
    }

    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPosicionReal() {
        return posicionReal;
    }

    public void setPosicionReal(int posicionReal) {
        this.posicionReal = posicionReal;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }


    private void numAleatorio() {
    }

    @Override
    public String toString() {
        return "RuletaRusa{" +
                "jugadores=" + jugadores +
                ", posicionReal=" + posicionReal +
                ", random=" + random +
                '}';
    }


    public boolean disparo(int jugadorIndex) {
        System.out.println("El jugador" + jugadores.get(jugadorIndex) + "murio");
        jugadores.remove(jugadorIndex);
        if (jugadores.isEmpty()) {
            System.out.println("Ya no hay jugadores");
            return true;
        } else {
            System.out.println("El jugador" + jugadores.get(jugadorIndex) + "sigue vivo");
        }

        numAleatorio();
        return false;
    }

    public void posicionnueva(){
        if (!jugadores.isEmpty()){
            posicionReal= random.nextInt(jugadores.size());
        }
    }
}



