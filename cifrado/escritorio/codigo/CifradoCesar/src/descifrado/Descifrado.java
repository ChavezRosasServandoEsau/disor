package descifrado;

import alfabeto_ingles.AlfabetoIngles;
import interfaces.FuncionesDescifrado;
import java.util.HashMap;
import java.util.Map;
import texto.Texto;

public class Descifrado implements FuncionesDescifrado {

    private Map<Integer, Character> mensajeCifrado = new HashMap<>();

    @Override
    public Texto descifrar(Texto mensaje, AlfabetoIngles alfabeto) {
        /*Cifrado Cesar*/
        for (Integer i = 0; i < mensaje.obtenerTexto().size(); i++) {
            for (Integer j = 0; j < alfabeto.obtenerAlfabeto().size(); j++) {
                if (mensaje.obtenerTexto().get(i).charValue() == alfabeto.obtenerAlfabeto().get(j).charValue()) {
                    mensajeCifrado.put(i, alfabeto.obtenerAlfabeto().get((j - 3) % 27));
                }
            }
        }
        return new Texto(mensajeCifrado);
    }

}
