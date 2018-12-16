
package paqueteAlfabeto.alfabetoGriego;

import java.util.HashMap;
import java.util.Iterator;
import paqueteAlfabeto.Alfabetos;
import paqueteCifradorVigeniere.CifradorVigeniere;
import paqueteClave.Clave;
import paqueteDescifradorVigeniere.DescifradorVigeniere;
import paqueteImpresorTexto.ImpresorTexto;
import paqueteLetra.Letra;
import paqueteMensaje.Mensaje;
import paqueteTexto.Texto;

public class AlfabetoGriego implements Alfabetos{
    private HashMap<Integer, Letra> alfabeto;
    private Integer indice =0,numero_ascii,clave,as_1=0,as_2=0;
    private Character caracter;
    private Letra letra;
    private Iterator<Integer> caracteres;

    public AlfabetoGriego() {
        alfabeto = new HashMap<Integer, Letra>();
        for (caracter = 945; caracter <= 969; caracter++) {
            numero_ascii = caracter-0;
            //ingresaCaracterEspecial1();
            alfabeto.put(indice, new Letra(numero_ascii,caracter));
            indice++;
        }
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
            as_1=let.getAscii(); as_2=alfabeto.get(clave).getAscii();
            if(as_1.intValue() == as_2.intValue()){ numero_ascii=clave;
            }
        }
        return numero_ascii;
    }
    
    @Override
    public Letra getLetraEnPosicion(Integer posicion){
        return alfabeto.get(posicion);
    }
    
    
    public static void main(String [] ags){
        AlfabetoGriego ae = new AlfabetoGriego();
        ImpresorTexto imp = new ImpresorTexto();
        //System.out.println("posicion "+ae.getPosicionDeLetra(new Letra('φ')));
        CifradorVigeniere cf = new CifradorVigeniere(ae);
        Texto txt = cf.getCifradoPorVigeniere(new Mensaje(new Texto("γεια")), new Clave(new Texto("ει")));
        System.out.println(imp.valorTexto(txt));
        DescifradorVigeniere dv = new DescifradorVigeniere(ae);
        Texto tx = dv.getDescifradoPorVigeniere(new Mensaje(new Texto("ηννι")),new Clave(new Texto("ει")));
        System.out.println(imp.valorTexto(tx));
        //cf.getCifradoPorVigeniere(new Mensaje(new Texto("γεια")), new Clave(new Texto("ει")));
    }
}
