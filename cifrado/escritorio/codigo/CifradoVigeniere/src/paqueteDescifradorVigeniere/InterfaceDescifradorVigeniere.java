
package paqueteDescifradorVigeniere;

import paqueteClave.Clave;
import paqueteMensaje.Mensaje;
import paqueteTexto.Texto;


public interface InterfaceDescifradorVigeniere {
    public Texto getDescifradoPorVigeniere(Mensaje mensaje, Clave clave);
}
