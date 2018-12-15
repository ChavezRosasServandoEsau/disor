package texto;

import java.util.Map;
import alfabeto_ingles.AlfabetoIngles;
import java.util.HashMap;

public class Texto {

    protected Map<Integer, Character> texto;

    public Texto(Map<Integer, Character> texto) {
        this.texto = texto;
    }

    /*Constructor solo para Test*/
    public Texto(String sTexto) {
        texto = new HashMap<>();
        for (int i = 0; i < sTexto.length(); i++) {
            texto.put(i, sTexto.charAt(i));
        }
    }

    public Boolean perteneceAlfabeto(AlfabetoIngles alfabetoIngles) {
        for (Integer i = 0; i < texto.size(); i++) {
            if (!alfabetoIngles.obtenerAlfabeto().containsValue(texto.get(i))) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public Map<Integer, Character> obtenerTexto() {
        return texto;
    }
    public void mostrarTextoEnConsola(){
        for (int i = 0; i < texto.size(); i++) {
            System.out.print(texto.get(i));            
        }
        
    }
}
