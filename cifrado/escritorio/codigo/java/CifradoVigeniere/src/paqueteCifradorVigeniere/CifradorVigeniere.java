
package paqueteCifradorVigeniere;

import java.util.HashMap;
import java.util.Iterator;
import paqueteAlfabeto.alfabetoEspañol.AlfabetoEspañol;
import paqueteAlfabeto.Alfabetos;
import paqueteAlfabeto.alfabetoIngles.AlfabetoIngles;
import paqueteClave.Clave;
import paqueteImpresorTexto.ImpresorTexto;
import paqueteLetra.Letra;
import paqueteMensaje.Mensaje;
import paqueteTexto.Texto;

public class CifradorVigeniere implements InterfaceCifradorVigeniere{
    
    private Alfabetos alfabeto;
    private HashMap<Integer,Character> contenido_texto = new HashMap<Integer,Character>();
    private HashMap<Integer,Character> contenido_clave = new HashMap<Integer,Character>();
    private HashMap<Integer,Character> contenido_resultado = new HashMap<Integer,Character>();
    private Letra letra_auxiliar1,letra_auxiliar2;
    private Integer contador,indice;
    
    public CifradorVigeniere(Alfabetos alfabeto){
        this.alfabeto=alfabeto;
        init();
    }
    
    @Override
    public Texto getCifradoPorVigeniere(Mensaje mensaje, Clave clave) {
        llena_contenido_texto(mensaje);
        llena_contenido_clave(clave);
        llena_contenido_resultado(mensaje,clave);
        //System.out.println(contenido_clave.size());
        return new Texto(concatCharacter(contenido_resultado).toString());
    }
    
    private StringBuilder concatCharacter(HashMap<Integer,Character> contenido_resultado){
        StringBuilder stb = new StringBuilder(contenido_resultado.size());
        for(indice=0;indice<contenido_resultado.size();indice++){
            stb.append(contenido_resultado.get(indice));
        }
        return stb;
    }
    
    private void init(){
        contenido_texto.clear();
        contenido_clave.clear();
        contenido_resultado.clear();
        contador= 0;
    }
    
    private void llena_contenido_texto(Mensaje m){
        contenido_texto.clear();
        for(contador=0;contador < m.getMensaje().getTexto().size();contador++){
            contenido_texto.put(contador, m.getMensaje().getTexto().get(contador));
        }
        //imprimeMapa(contenido_texto);
    }
    
    private void llena_contenido_clave(Clave c){
        contenido_clave.clear(); indice =0;
        for(contador=0;contador < contenido_texto.size(); contador++){
            if(indice == c.getClave().getTexto().size()){ indice=0;}
            contenido_clave.put(contador, c.getClave().getTexto().get(indice));
            indice++;
        }
        //imprimeMapa(contenido_clave);
    }
    
    private void llena_contenido_resultado(Mensaje m, Clave clv){
        contenido_resultado.clear();
        for(contador=0; contador < contenido_texto.size(); contador++){
            letra_auxiliar1 = new Letra(contenido_texto.get(contador));
            letra_auxiliar2 = new Letra(contenido_clave.get(contador));
            //System.out.println("Letra1: "+letra_auxiliar1.getCharacter()+" "+letra_auxiliar1.getAscii());
            //System.out.println("Letra2: "+letra_auxiliar2.getCharacter()+" "+letra_auxiliar2.getAscii());
            //System.out.println(calculaNuevoIndice(letra_auxiliar1, letra_auxiliar2));
            contenido_resultado.put(contador, alfabeto.getLetraEnPosicion(calculaNuevoIndice(letra_auxiliar1, letra_auxiliar2)).getCharacter());
        }//imprimeMapa(contenido_resultado);
    }
    
    private Integer calculaNuevoIndice(Letra letra_mensaje, Letra letra_clave){
        //System.out.println(((alfabeto.getPosicionDeLetra(letra_mensaje))+(alfabeto.getPosicionDeLetra(letra_clave)) ) % alfabeto.getAlfabeto().size());
        //System.out.print(alfabeto.getPosicionDeLetra(letra_mensaje)+" + ");
        //System.out.print(alfabeto.getPosicionDeLetra(letra_clave)+" % ");
        //System.out.println(alfabeto.getAlfabeto().size());
        return ( (alfabeto.getPosicionDeLetra(letra_mensaje))+(alfabeto.getPosicionDeLetra(letra_clave)) ) % alfabeto.getAlfabeto().size();
    }
    
    /*
    private void imprimeMapa(HashMap<Integer,Character> mapa){
        Iterator<Integer> caracteres;
        Integer clave;
        caracteres = null;
        caracteres = mapa.keySet().iterator();
        while(caracteres.hasNext()){
            clave = caracteres.next();
            System.out.println(clave+" -> "+mapa.get(clave));
        }
    }*/
    /*
    public static void main(String ags[]){
        Alfabetos alfa = new AlfabetoIngles();
        ImpresorTexto imp = new ImpresorTexto();
        CifradorVigeniere cv = new CifradorVigeniere(alfa);
        
        Mensaje msg = new Mensaje(new Texto("entonces una aldea"));
        Clave cla = new Clave(new Texto("era"));
        System.out.println(imp.valorTexto(cv.getCifradoPorVigeniere(msg, cla)));
    }

*/
    
}
