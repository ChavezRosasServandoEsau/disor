/*Yo mero*/
package pruebas;

import alfabeto_ingles.AlfabetoIngles;
import cifrado_cesar.CifradoCesar;
import java.util.HashMap;
import java.util.Map;
import texto.Texto;
import descifrado.Descifrado;

public class Test {

    public static void main(String[] args) {
        /*
        AlfabetoIngles alfabetoIngles = new AlfabetoIngles();
        Map<Integer, Character> alfabeto = new HashMap<>();
        alfabeto = alfabetoIngles.obtenerAlfabeto();

        
        Map<Integer, Character> mensaje = new HashMap<>();
        mensaje.put(new Integer(0), new Character('c'));
        mensaje.put(new Integer(1), new Character('e'));
        mensaje.put(new Integer(2), new Character('s'));
        mensaje.put(new Integer(3), new Character('a'));
        mensaje.put(new Integer(4), new Character('r'));
        mensaje.put(new Integer(5), new Character('e'));
        mensaje.put(new Integer(6), new Character('l'));
        mensaje.put(new Integer(7), new Character('g'));
        mensaje.put(new Integer(8), new Character('e'));
        mensaje.put(new Integer(9), new Character('m'));
        mensaje.put(new Integer(10), new Character('p'));
        mensaje.put(new Integer(11), new Character('e'));
        mensaje.put(new Integer(12), new Character('r'));
        mensaje.put(new Integer(13), new Character('a'));
        mensaje.put(new Integer(14), new Character('d'));
        mensaje.put(new Integer(15), new Character('o'));
        mensaje.put(new Integer(16), new Character('1'));*/

        AlfabetoIngles alfabetoIngles = new AlfabetoIngles();
        Map<Integer, Character> alfabeto = new HashMap<>();
        alfabeto = alfabetoIngles.obtenerAlfabeto();

        Texto texto1 = new Texto("cesarelemperador");
        //Texto texto1 = new Texto("cifradoromano");
        //Texto texto3 = new Texto("cesarelemperador");
        
                

        if (texto1.perteneceAlfabeto(alfabetoIngles)) {
            CifradoCesar cifradoCesar = new CifradoCesar(texto1, alfabetoIngles);
            cifradoCesar.mostrarCifrado();
            System.out.println("");
            Descifrado descifrado=new Descifrado();
            descifrado.descifrar(cifradoCesar.obtenerCifrado(), alfabetoIngles).mostrarTextoEnConsola();
        } else {
            System.out.println("Mensaje no pertenece al alfabeto, intentelo de nuevo");
        }
    }
    //F  H  V  D  U  H  O  H  P  S  H  U  D  G  R  U
    //fhvduhohpshudgru OK
}
