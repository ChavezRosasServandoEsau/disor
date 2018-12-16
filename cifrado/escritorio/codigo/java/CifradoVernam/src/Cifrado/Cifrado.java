package Cifrado;

import Alfabeto.Alfabeto;

public class Cifrado {
    private Alfabeto alfabeto;

    public Cifrado(Alfabeto alfabeto) {
        this.alfabeto=alfabeto;
    }
    public MensajeCifrado cifrarVernam(Mensaje mensaje, Clave clave) {
        //Logica
        //Sobre el mensjae:
        //1-caracter a ASCCI
        //El AsCII a Binario
        
        //Se genera una clave en binario con la misma longitul que el mensaje (En binaro)
        //Re realiza un or exclusivo sobre cada caracter
        //El resultado es el MensajeCifrado
        return new MensajeCifrado("Descifrado");
    }

    public Mensaje decifrarVernam(MensajeCifrado mensaje, Clave clave) {
        return new Mensaje("Descifrado");
    }


}
