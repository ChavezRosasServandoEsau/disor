
package paqueteLetra;

public class Letra implements InterfazLetras{
    
    private Integer ascii;
    private Character caracter;
    
    public Letra(Integer ascii,Character caracter){
        this.ascii=ascii;
        this.caracter=caracter;
    }
    
    public Letra(Character caracter){
        this.caracter=caracter;
        ascii = caracter-0;
        //System.out.println(ascii);
        evalua(caracter);
    }
    
    private void evalua(Character caracter){
        if(caracter == 'á'){ ascii = -1;}
        if(caracter == 'é'){ ascii = -2;}
        if(caracter == 'í'){ ascii = -3;}
        if(caracter == 'ñ'){ ascii = -4;}
        evalua2(caracter);
    }
    
    private void evalua2(Character caracter){
        if(caracter == 'ó'){ ascii = -5;}
        if(caracter == 'ú'){ ascii = -6;}
        if(caracter == 'ü'){ ascii = -7;}
    }
    
    @Override
    public Integer getAscii(){
        return ascii;
    }
    
    @Override
    public Character getCharacter(){
        return caracter;
    }
    
    
    /*
    public static void main(String []ags){
        Letra l = new Letra('R');
        System.out.println(l.getAscii());
    }*/
}
