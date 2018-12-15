package Alfabeto;

import java.util.Arrays;

public class Alfabeto {

    public char[] caracteres;
    public char[] caracteresASCII;

    public Alfabeto() {

    }

    public Alfabeto(char[] caracteres, char[] caracteresASCII) {
        this.caracteres = caracteres;
        this.caracteresASCII = caracteresASCII;
    }
    public String getCaracteres(){
        return Arrays.toString(caracteresASCII);
    }
    public String getCaracteresASCII(){
        return Arrays.toString(caracteresASCII);
    }
}
