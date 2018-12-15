
package paqueteMensaje;

import paqueteTexto.Texto;

public class Mensaje implements InterfaceMensaje{
    private Texto mensaje;
    
    public Mensaje(Texto mensaje){
        if(mensaje.getTexto().size() < 2){
            throw new RuntimeException("Texto muy pequeño Mensaje no creado");
        }
        this.mensaje=mensaje;
    }
    
    public Texto getMensaje(){
        return mensaje;
    }
}
