
package paqueteImpresorTexto;

import java.util.Iterator;
import paqueteTexto.Texto;

public class ImpresorTexto implements InterfaceImpresorTexto{
    private String contenido = new String();
    Integer clave;
    Iterator<Integer> caracteres;
    
    public ImpresorTexto(){
    }
    
    @Override
    public String valorTexto(Texto texto){
         caracteres = null; contenido = ""; caracteres = texto.getTexto().keySet().iterator();
        while(caracteres.hasNext()){
            clave = caracteres.next();
            contenido+= texto.getTexto().get(clave);
        }
        return contenido;
    }
}
