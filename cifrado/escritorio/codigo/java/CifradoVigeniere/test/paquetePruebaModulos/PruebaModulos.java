
package paquetePruebaModulos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import paqueteAlfabeto.Alfabetos;
import paqueteAlfabeto.alfabetoFrances.AlfabetoFrances;
import paqueteCifradorVigeniere.CifradorVigeniere;
import paqueteClave.Clave;
import paqueteImpresorTexto.ImpresorTexto;
import paqueteMensaje.Mensaje;
import paqueteTexto.Texto;

public class PruebaModulos {
    
    public PruebaModulos() {
    }
    
    static Alfabetos ae;
    static ImpresorTexto imp;
    static CifradorVigeniere cf;
    
    @BeforeClass
    public static void setUpClass() {
         ae = new AlfabetoFrances();
         imp = new ImpresorTexto();
         cf = new CifradorVigeniere(ae);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        Texto txt = cf.getCifradoPorVigeniere(new Mensaje(new Texto("ENTONCES")), new Clave(new Texto("ERA")));
        System.out.println(imp.valorTexto(txt));
    }
}
