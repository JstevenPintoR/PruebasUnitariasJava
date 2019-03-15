
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 * esta clase es en la cual se recibe los datos quemados del mapa
 */
public class Principal {

    public Principal() {
            
    }
     Map<Integer, Persona> mapaAbuelo = new HashMap();

/**
 * 
 * @param Llave
 * @param Ansestro
 * @metodo en el cual se realiza la busqueda e impresion de los datos del mapa
 * 
 */
     public String  imprimir (int Llave , Map Ansestro  ){
    mapaAbuelo.putAll(Ansestro);
    String contenedor = "";
    
    for (Integer KeyAbuelo : mapaAbuelo.keySet()){
        Persona pAbuelo = mapaAbuelo.get(KeyAbuelo);
        for(Integer KeyPadre : pAbuelo.getHijos().keySet()){
            Persona  pPadre = pAbuelo.getHijos().get(KeyPadre);
            for(Integer KeyHijo : pPadre.getHijos().keySet()){
                Persona pHijo = pPadre.getHijos().get(KeyHijo);
              if(mapaAbuelo.containsKey(Llave)){
                if(KeyAbuelo == Llave ){
    
                contenedor = contenedor.concat(pAbuelo.getNombre());
                 contenedor = contenedor.concat(pPadre.getNombre());
                  contenedor = contenedor.concat(pHijo.getNombre());
                System.out.println("  soy el abuelo    "+pAbuelo.getNombre());
                System.out.println("    padre  de   " + pPadre.getNombre());
                System.out.println(" mi nieto  " +pHijo.getNombre());  
            }
              }              
                else if(mapaAbuelo.get(KeyAbuelo).getHijos().containsKey(Llave)){
                 if(KeyPadre ==Llave){
                  
                  contenedor = contenedor.concat(pAbuelo.getNombre());
                  contenedor = contenedor.concat(pPadre.getNombre());
                  contenedor = contenedor.concat(pHijo.getNombre());
                 System.out.println("  soy       " + pPadre.getNombre());
                 System.out.println("mi padre    "+pAbuelo.getNombre());
                 System.out.println("mi hij@  " +pHijo.getNombre());   
                 }   
                }     
                 else if(mapaAbuelo.get(KeyAbuelo).getHijos().get(KeyPadre).getHijos().containsKey(Llave)){
                 if(KeyHijo ==Llave){
                 contenedor = contenedor.concat(pAbuelo.getNombre());
                 contenedor = contenedor.concat(pPadre.getNombre());
                 contenedor = contenedor.concat(pHijo.getNombre());
                     
                 System.out.println(" soy  " +pHijo.getNombre());  
                 System.out.println("  soy el hijo      " + pPadre.getNombre());
                 System.out.println("  mi abuelo    "+pAbuelo.getNombre());
                 
                 }   
                }
              
              
            }
        }
    }
     
  
return contenedor;
} 

}