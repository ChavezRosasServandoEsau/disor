package Cifrado;

public class Texto {
    protected String contenido;

    public Texto(String contenido) {
        this.contenido = contenido;
    }
    public Texto() {
        this.contenido = "";
    }

    @Override
    public String toString() {
        return contenido;
    }
    public String toBinario() {
        return contenido;
    }

}
