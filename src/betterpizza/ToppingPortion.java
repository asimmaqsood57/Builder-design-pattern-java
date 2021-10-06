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
public enum ToppingPortion {
    
     Full("Both Sides",1),
  LeftHalf("Left half only",0.5),
  RightHalf("Right half only",0.5);

  private final String descriptor;
  private final double costMultiplier;

  public String toString() {
    return this.descriptor;
  }

  public double getCostMultiplier() {
    return this.costMultiplier;
  }

  ToppingPortion(String d, double costMultiplier) {
    this.descriptor = d;
    this.costMultiplier = costMultiplier;
  }
    
    
    
}
