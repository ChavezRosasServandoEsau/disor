package alfabeto_ingles;

/*[https://es.wikipedia.org/wiki/Codificaci%C3%B3n_de_caracteres]*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import alfabeto.Alfabeto;

public class AlfabetoIngles extends Alfabeto {

    public AlfabetoIngles() {
        super.mapaAlfabeto = new HashMap<>();
        Integer j = 0;
        for (Character i = 97; i <= 122; i++) {
            super.mapaAlfabeto.put(j++, i);
        }
    }

    /*public static void main(String[] args) {
        AlfabetoIngles alfabetoIngles = new AlfabetoIngles();
        alfabetoIngles.imprimirAlfabeto();
    }*/
}
