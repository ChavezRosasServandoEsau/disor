package cifrado_cesar;

import alfabeto_ingles.AlfabetoIngles;
import cifrado.Cifrado;
import java.util.HashMap;
import java.util.Map;
import texto.Texto;
import interfaces.FuncionesCifradoCesar;

public class CifradoCesar implements FuncionesCifradoCesar {

    Cifrado cifrado;
    Texto mensajeCifrado;

    public CifradoCesar(Texto mensaje, AlfabetoIngles alfabetoIngles) {
        cifrado = new Cifrado();
        mensajeCifrado = cifrado.cifrar(mensaje, alfabetoIngles);
    }

    public Texto obtenerCifrado() {
        return mensajeCifrado;
    }

    @Override
    public void mostrarCifrado() {
        mensajeCifrado.mostrarTextoEnConsola();

    }

}
