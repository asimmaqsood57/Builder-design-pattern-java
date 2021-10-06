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
public interface pizza extends observablePizza {
   
    
    
  /**
   * Set the type of crust for this pizza.
   * @param crust the crust for this pizza
   */
  void setCrust(Crust crust);

  /**
   * Set the size of this pizza.
   * @param size the size of this pizza
   */
  void setSize(Size size);

  /**
   * Add the specified topping in the specified portion to this pizza. If this
   * topping already exists on the pizza, it will overwrite its portion with
   * the specified portion size.
   * @param name the name of the topping
   * @param portion the portion size of this topping
   */
  void addTopping(ToppingName name,ToppingPortion portion);

  /**
   * Remove the specified topping from this pizza. This method has no effect
   * if the topping is not present on this pizza.
   * @param name the name of the topping to be removed
   */
  void removeTopping(ToppingName name);
  
  
    
    
}
