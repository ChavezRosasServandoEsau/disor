package Cifrado;

import java.util.Random;

public class Clave extends Texto {

    int numeroDeCaracteres;

    public Clave(String contenido) {
        super(contenido);
    }

    public Clave(int longitud) {
        numeroDeCaracteres = longitud;//super.contenido.length();
        super.contenido = claveAleatoria(0);
    }

    private String claveAleatoria(int posicion) {
        Random ran = new Random();
        return (posicion == (numeroDeCaracteres * 8)) ? "" : (ran.nextInt(2) + 0 + claveAleatoria(posicion + 1));
    }

}
