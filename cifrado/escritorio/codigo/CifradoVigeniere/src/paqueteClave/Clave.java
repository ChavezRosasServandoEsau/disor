
package paqueteClave;

import paqueteTexto.Texto;

public class Clave implements InterfaceClave{
    
    private Texto texto;

    public Clave(Texto texto) {
        if(texto.getTexto().size() < 2){
            throw new RuntimeException("Texto muy pequeño Clave no Creada");
        }
        this.texto = texto;
    }

    @Override
    public Texto getClave() {
        return texto;
    }
    
}
