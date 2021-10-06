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
public enum Size {
    
    
    Small(3.0),  Medium(5.0), Large(7.0);

  private final double baseCost;

  public double getBaseCost() {
    return this.baseCost;
  }

  Size(double bc) {
    this.baseCost = bc;
  }
  
  
  
  
  
    
    
}
    