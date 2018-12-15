/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Cifrado.Cifrado;
import Cifrado.Clave;
import Cifrado.Mensaje;
import Cifrado.MensajeCifrado;
import java.util.Random;

public class Main {
/*    int numeroDeCaracteres =2;
private static  String claveAleatoria(String caracter) {
        if (caracter.length() == numeroDeCaracteres * 8) {
            return caracter;
        }
        Random ran = new Random();
        return caracter + claveAleatoria("" + ran.nextInt(2) + 0);
    }*/
    public static void main(String[] args) {
        //Clave clave=new Clave("0101010101");//Los valores pueden se obtenidos de cualquier fuente(CSV,XML
        //Pero sería más seguro si la clave se generara aleatoriamente
        //O hacemos 2 constructores?
//        Mensaje mensaje=new Mensaje(contenido)
        /*Random ran = new Random();
        String clave = "";
        clave += ran.nextInt(2) + 0;
        System.out.println(clave);*/
        Clave clave=new Clave(2);
        System.out.println(clave.toString());
        

    }

}
