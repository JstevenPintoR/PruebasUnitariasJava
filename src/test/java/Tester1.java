/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stevenpc
 * clase en la que realizamos pruebas
 */
public class Tester1 {
   
    static  Map<Integer, Persona> mapaAbuelo = new HashMap();
    
    
    public Tester1() {
    }
    
   /**
    * 
    * metodo que se ejecuta antes de cada clase
    */
    @BeforeClass
    public static void setUpClass() {
        
        abuelos();
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

    /**
     * metodo para quemar los datos
     * */
    public  static void abuelos(){  
      
        
             
       mapaAbuelo.put(1, new Persona (1,"Juan"));
       mapaAbuelo.put(2, new Persona (2,"Jose"));
       
       
       mapaAbuelo.get(1).getHijos().put(3,new Persona (3, "andres"));
       mapaAbuelo.get(1).getHijos().put(4,new Persona (4, "maria"));
       mapaAbuelo.get(1).getHijos().put(5,new Persona (5, "carlos"));
       
       mapaAbuelo.get(1).getHijos().get(3).getHijos().put(9,new Persona (9, "juana"));
       mapaAbuelo.get(1).getHijos().get(3).getHijos().put(10,new Persona (10, "paola"));
       mapaAbuelo.get(1).getHijos().get(4).getHijos().put(11,new Persona (11, "sofia"));
       mapaAbuelo.get(1).getHijos().get(5).getHijos().put(12,new Persona (12, "jaime"));
       
       mapaAbuelo.get(2).getHijos().put(6,new Persona (6, "alberto"));
       mapaAbuelo.get(2).getHijos().put(7,new Persona (7, "jimmy"));
       mapaAbuelo.get(2).getHijos().put(8,new Persona (8, "jhon"));
       
       mapaAbuelo.get(2).getHijos().get(6).getHijos().put(13,new Persona (13, "tataiana"));
 
       mapaAbuelo.get(2).getHijos().get(6).getHijos().put(14,new Persona (14, "fernanda"));
       mapaAbuelo.get(2).getHijos().get(7).getHijos().put(15,new Persona (15, "viviana"));
       mapaAbuelo.get(2).getHijos().get(8).getHijos().put(16,new Persona (16, "diana"));   
    }
    
   
    

// TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
 
  
  /**
   * metodo en el cual se realiza el primer test con el mapa abuelo buscando por el abuelo
   * 
   */
    @Test 
public void testUno(){
Principal p = new Principal();
String s = p.imprimir(1, mapaAbuelo);
    assertEquals("JuanandresjuanaJuanandrespaolaJuanmariasofiaJuancarlosjaime", s);
    
}
 /**
   * metodo en el cual se realiza el segundo test con el mapa abuelo buscando por el padre
   * 
   */
@Test 
public void testDos(){
Principal p = new Principal();
String s = p.imprimir(3, mapaAbuelo);
    assertEquals("JuanandresjuanaJuanandrespaola", s);
    
}

/**
   * metodo en el cual se realiza el tercer test con el mapa abuelo buscando por el hijo
   * 
   */
@Test 
public void testTres(){
Principal p = new Principal();
String s = p.imprimir(11, mapaAbuelo);
    assertEquals("Juanmariasofia", s);
    
    

}
/**
   * metodo en el cual se realiza el cuarto test con el mapa abuelo cundo se le envia una busqueda con un id que no esta en el mapa
   * 
   */
@Test 
public void testCuatro(){
Principal p = new Principal();
String s = p.imprimir(50, mapaAbuelo);
    assertEquals("", s);
    }
}