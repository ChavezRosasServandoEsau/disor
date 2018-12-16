/*[https://es.wikipedia.org/wiki/Codificaci%C3%B3n_de_caracteres]*/
package alfabeto_español;

import java.util.HashMap;
import java.util.Map;
import alfabeto.Alfabeto;

/*á [0x00e1] - é [0x00e9] - í [0x00ed] - ó[0x00f3] - ú [0x00fa] - ü [0x00fc] - ñ [0x00F1]*/
public class AlfabetoEspañol extends Alfabeto {

    public AlfabetoEspañol() {/*ñ*/
        Integer j = 0;
        for (Character i = 97; i <= 122; i++) {
            super.mapaAlfabeto.put(j++, i);
            if (i == 110) {
                super.mapaAlfabeto.put(j++, 'ñ');
            }
        }
    }

    /*public static void main(String[] args) {
        AlfabetoEspañol alfabetoEspañol = new AlfabetoEspañol();
        alfabetoEspañol.imprimirAlfabeto();
    }*/
}
