package alfabeto;

import interfaces.Letra;
import java.util.HashMap;
import java.util.Map;

public class Alfabeto implements Letra {

    protected Map<Integer, Character> mapaAlfabeto;

    public Alfabeto() {
        mapaAlfabeto = new HashMap<>();

    }

    public Alfabeto(Map<Integer, Character> alfabeto) {
        this.mapaAlfabeto = alfabeto;
    }

    public void imprimirAlfabeto() {
        for (Map.Entry<Integer, Character> collecionMapa : mapaAlfabeto.entrySet()) {
            System.out.println(collecionMapa.getKey() + " - " + collecionMapa.getValue());
        }
    }

    public Map<Integer, Character> obtenerAlfabeto() {
        return mapaAlfabeto;
    }

    @Override
    public Character toMayuscula(Character letra) {
        return Character.toUpperCase(letra);
    }

    @Override
    public Character toMinsucula(Character letra) {
        return Character.toLowerCase(letra);
    }

}
