
package paqueteTexto;

import java.util.HashMap;
import paqueteAlfabeto.Alfabetos;

public class Texto implements InterfaceTexto{

    private HashMap<Integer,Character> contenido = new HashMap<Integer,Character>();
    private Integer indice;
    
    public Texto(String texto){
        //texto=texto.toLowerCase();
        texto = texto.replace(" ","");
        if(texto.length()==0){ throw new RuntimeException("Texto Vacio");}
        for(indice=0; indice < texto.length();indice++){
            contenido.put(indice,(texto.charAt(indice)));
        }
    }
    
    public Texto(HashMap<Integer, Character> texto) {
        this.contenido = texto;
    }

    @Override
    public HashMap<Integer,Character> getTexto() {
        return contenido;
    }
    
    public Boolean perteneceAlfabeto(Alfabetos alfabeto) {
        for (Integer i = 0; i < alfabeto.getAlfabeto().size(); i++) {
            if (!alfabeto.getAlfabeto().containsValue(contenido.get(i))) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
    
}
