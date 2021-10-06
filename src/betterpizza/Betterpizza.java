/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterpizza;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author M.Asim Maqsood
 */
public class Betterpizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Hello World");

        
        observablePizza alacarte = (observablePizza) new AlaCartePizza.AlaCartePizzaBuilder().setCrust(Crust.Classic).setSize(Size.Small).build();

        
        
        
    }

}
