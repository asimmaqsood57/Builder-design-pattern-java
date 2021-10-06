/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterpizza;

/**
 *
 * @author M.Asim Maqsood
 */
public interface observablePizza{


         /**
   * Get the cost of this pizza
   *
   * @return the cost of this pizza in MM.CC format
   */
  double cost();

  
  
    /**
   * Determines if the specified topping is on this pizza and if so, return its portion
   *
   * @param name the name of the topping
   * @return the portion of this topping on this pizza, or null if the given topping is not
   * on this pizza
   */
  ToppingPortion hasTopping(ToppingName name);

    
    
    
}
