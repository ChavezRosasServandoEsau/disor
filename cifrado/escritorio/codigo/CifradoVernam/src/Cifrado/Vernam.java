package Cifrado;

public class Vernam {
    Mensaje mensaje;
    Clave clave;
    MensajeCifrado mensajeCifrado;

    public Vernam(Mensaje mensaje, Clave clave, MensajeCifrado mensajeCifrado) {
        this.mensaje = mensaje;
        this.clave = clave;
        this.mensajeCifrado = mensajeCifrado;
    }
    
    
}
