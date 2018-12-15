package Cifrado;

public class Mensaje extends Texto {

    public Mensaje(String contenido) {
        super(contenido);
    }

    public void toMayuscula() {
        super.contenido = super.contenido.toUpperCase();
    }
    
    public void toMinuscula() {
        super.contenido = super.contenido.toLowerCase();
    }
}
