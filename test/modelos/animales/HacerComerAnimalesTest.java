/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.animales;

import interfaces.Alimentarce;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JULIO
 */
public class HacerComerAnimalesTest {
    
    public HacerComerAnimalesTest() {
        
        
        
        
    }
    
    @Test
    public void hacerlosComer(){
        Perro p = new Perro();
        Vaca v = new Vaca();
        Ballena b = new Ballena();
        
        List<Alimentarce> zoologico = new ArrayList<>();
        zoologico.add(b);
        zoologico.add(v);
        zoologico.add(p);
        
       // for (Alimentarce animal : zoologico){
        //    animal.comer();
       // }
        
        zoologico.stream().forEach(a ->{
            String logroComer = a.comer() ? "Lo Logro" : "no tiene hambre";
            System.out.println(String.format("El animal %s", logroComer));
        });
    
  
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    }
    
}
