
package paqueteAlfabeto;

import java.util.HashMap;
import paqueteLetra.Letra;

public interface Alfabetos {
    
    public HashMap<Integer,Letra> getAlfabeto();
    
    public Integer getPosicionDeLetra(Letra let);
    public Letra getLetraEnPosicion(Integer posicion);
    
}
