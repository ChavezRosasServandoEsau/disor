
package paqueteAlfabeto.alfabetoEspañol;

import java.util.HashMap;
import java.util.Iterator;
import paqueteAlfabeto.Alfabetos;
import paqueteLetra.Letra;

public class AlfabetoEspañol implements Alfabetos{
    
    private HashMap<Integer, Letra> alfabeto = new HashMap<Integer, Letra>();
    private Integer indice =0,numero_ascii,clave,as_1=0,as_2=0;
    private Character caracter;
    private Letra letra;
    private Iterator<Integer> caracteres;

    public AlfabetoEspañol() {
        for (caracter = 97; caracter <= 122; caracter++) {
            numero_ascii = caracter-0;
            ingresaCaracterEspecial1();
            alfabeto.put(indice, new Letra(numero_ascii,caracter));
            indice++;
        }
    }
    
    private void ingresaCaracterEspecial1(){
            if(indice==1){ alfabeto.put(indice, new Letra(-1,'á')); indice++;}
            if(indice==6){ alfabeto.put(indice, new Letra(-2,'é')); indice++;}
            if(indice==11){ alfabeto.put(indice, new Letra(-3,'í'));indice++;}
            if(indice==17){ alfabeto.put(indice, new Letra(-4,'ñ'));indice++;}
            ingresaCaracterEspecial2();
    }
    
    private void ingresaCaracterEspecial2(){
        if(indice==19){ alfabeto.put(indice, new Letra(-5,'ó'));indice++;}
        if(indice==26){ alfabeto.put(indice, new Letra(-6,'ú'));indice++;}
        if(indice==27){ alfabeto.put(indice, new Letra(-7,'ü'));indice++;}
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
    
    /*
    public static void main(String [] ags){
        AlfabetoEspañol ae = new AlfabetoEspañol();
        ae.imprimeMapa();
        System.out.println("posicion "+ae.getPosicionDeLetra(new Letra('á')));
        //System.out.println(ae.getLetraEnPosicion(1).getCharacter());
        //int x1 = ae.getPosicionDeLetra(new Letra(101,'e'));
        //int x2 = ae.getPosicionDeLetra(new Letra(101,'e'));
        //System.out.println(((x1)+(x2))%ae.getAlfabeto().size());
        System.out.println(ae.getAlfabeto().size());
    }
*/
}
