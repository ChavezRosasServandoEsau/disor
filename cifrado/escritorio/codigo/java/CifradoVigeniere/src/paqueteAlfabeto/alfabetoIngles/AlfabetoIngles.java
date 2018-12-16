
package paqueteAlfabeto.alfabetoIngles;

import java.util.HashMap;
import java.util.Iterator;
import paqueteAlfabeto.Alfabetos;
import paqueteLetra.Letra;

public class AlfabetoIngles implements Alfabetos{
    private HashMap<Integer, Letra> alfabeto = new HashMap<Integer, Letra>();
    private Integer indice =0,numero_ascii,clave;
    private Character caracter;
    private Letra letra;
    private Iterator<Integer> caracteres;

    public AlfabetoIngles() {
        for (caracter = 97; caracter <= 122; caracter++) {
            numero_ascii = caracter-0;
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
            if(let.getAscii()== alfabeto.get(clave).getAscii()){ 
                numero_ascii=clave;
                //System.out.println("-------------------------------------");
                //System.out.print(let.getAscii()+"-");
                //System.out.print(alfabeto.get(clave).getAscii()+"\n");
            }
            indice++;
        }
        return numero_ascii;
    }
    
    @Override
    public Letra getLetraEnPosicion(Integer posicion){
        return alfabeto.get(posicion);
    }
    
    /*
    public static void main(String [] ags){
        AlfabetoIngles ae = new AlfabetoIngles();
        ae.imprimeMapa();
        System.out.println("posicion "+ae.getPosicionDeLetra(new Letra('a')));
        //System.out.println(ae.getLetraEnPosicion(1).getCharacter());
        //int x1 = ae.getPosicionDeLetra(new Letra(101,'e'));
        //int x2 = ae.getPosicionDeLetra(new Letra(101,'e'));
        //System.out.println(((x1)+(x2))%ae.getAlfabeto().size());
        System.out.println(ae.getAlfabeto().size());
    }*/
}
