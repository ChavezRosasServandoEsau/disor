
package paqueteCifradorVigeniere;

import paqueteClave.Clave;
import paqueteMensaje.Mensaje;
import paqueteTexto.Texto;

public interface InterfaceCifradorVigeniere {
    public Texto getCifradoPorVigeniere(Mensaje mensaje, Clave clave);
}
