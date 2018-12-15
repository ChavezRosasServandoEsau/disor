
package paqueteAlfabeto.alfabetoFrances;

import java.util.HashMap;
import java.util.Iterator;
import paqueteAlfabeto.Alfabetos;
import paqueteAlfabeto.alfabetoGriego.AlfabetoGriego;
import paqueteCifradorVigeniere.CifradorVigeniere;
import paqueteClave.Clave;
import paqueteDescifradorVigeniere.DescifradorVigeniere;
import paqueteImpresorTexto.ImpresorTexto;
import paqueteLetra.Letra;
import paqueteMensaje.Mensaje;
import paqueteTexto.Texto;

public class AlfabetoFrances implements Alfabetos{
    
    private HashMap<Integer, Letra> alfabeto;
    private Integer indice =0,numero_ascii,clave,as_1=0,as_2=0;
    private Character caracter;
    private Letra letra;
    private Iterator<Integer> caracteres;

    public AlfabetoFrances() {
        alfabeto = new HashMap<Integer, Letra>();

        alfabeto.put(0, new Letra('A'));
        alfabeto.put(1, new Letra('B'));
        alfabeto.put(2, new Letra('C'));
        alfabeto.put(3, new Letra('Ç'));
        alfabeto.put(4, new Letra('D'));
        alfabeto.put(5, new Letra('E'));
        alfabeto.put(6, new Letra('F'));
        alfabeto.put(7, new Letra('G'));
        alfabeto.put(8, new Letra('H'));
        alfabeto.put(9, new Letra('I'));
        alfabeto.put(10, new Letra('J'));
        alfabeto.put(11, new Letra('K'));
        alfabeto.put(12, new Letra('L'));
        alfabeto.put(13, new Letra('N'));
        alfabeto.put(14, new Letra('M'));
        alfabeto.put(15, new Letra('N'));
        alfabeto.put(16, new Letra('O'));
        alfabeto.put(17, new Letra('Ρ'));
        alfabeto.put(18, new Letra('Q'));
        alfabeto.put(19, new Letra('R'));
        alfabeto.put(20, new Letra('S'));
        alfabeto.put(21, new Letra('T'));
        alfabeto.put(22,new Letra('U'));
        alfabeto.put(23, new Letra('V'));
        alfabeto.put(24, new Letra('W'));
        alfabeto.put(25, new Letra('X'));
        alfabeto.put(26, new Letra('Y'));
        alfabeto.put(27, new Letra('Z'));

        alfabeto.put(28, new Letra('Œ'));
        alfabeto.put(29, new Letra('Æ'));
        alfabeto.put(30, new Letra('â'));
        alfabeto.put(31, new Letra('ê'));
        alfabeto.put(32, new Letra('î'));
        alfabeto.put(33, new Letra('ô'));
        alfabeto.put(34, new Letra('û'));  //imprimeMapa();
    }
    
    private void imprimeMapa(){
        caracteres = null;
        caracteres = alfabeto.keySet().iterator();
        indice=0;
        while(caracteres.hasNext()){
            clave = caracteres.next();
            System.out.println(clave+"  "+alfabeto.get(clave).getAscii()+"  "+alfabeto.get(clave).getCharacter());
            indice++;
        }
    }

    @Override
    public HashMap<Integer, Letra> getAlfabeto() {
        return alfabeto;
    }

    public Integer getPosicionDeLetra(Letra let) {
         caracteres = null; 
         caracteres = alfabeto.keySet().iterator(); 
         indice =0;
         numero_ascii=-1;
        return iterandoLetras(let);
    }
    
    private Integer iterandoLetras(Letra let){
        while(caracteres.hasNext()){
            clave = caracteres.next();
            //System.out.println(clave);//========================
            as_1=let.getAscii().intValue(); as_2=alfabeto.get(clave).getAscii().intValue();
            if(as_1.intValue() == as_2.intValue()){ numero_ascii=clave;}
        }
        return numero_ascii;
    }
    
    @Override
    public Letra getLetraEnPosicion(Integer posicion){
        return alfabeto.get(posicion);
    }
    
    /*
    public static void main(String [] ags){
        Alfabetos ae = new AlfabetoFrances();
        ImpresorTexto imp = new ImpresorTexto();
        CifradorVigeniere cf = new CifradorVigeniere(ae);
        Texto txt = cf.getCifradoPorVigeniere(new Mensaje(new Texto("ENTONCES")), new Clave(new Texto("ERA")));
        System.out.println(imp.valorTexto(txt));
        DescifradorVigeniere dv = new DescifradorVigeniere(ae);
        Texto s = dv.getDescifradoPorVigeniere(new Mensaje(new Texto("JûTTûCJD")), new Clave(new Texto("ERA")));
        System.out.println(imp.valorTexto(s));
    }

    */
}
