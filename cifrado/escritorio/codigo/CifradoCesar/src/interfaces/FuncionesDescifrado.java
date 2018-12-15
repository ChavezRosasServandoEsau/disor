/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import alfabeto_ingles.AlfabetoIngles;
import texto.Texto;

/**
 *
 * @author Erik
 */
public interface FuncionesDescifrado {
    public Texto descifrar(Texto mensaje, AlfabetoIngles alfabeto);
    
}
