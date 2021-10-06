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
public enum Crust {
    
    
      Classic("Classic"),Stuffed("Stuffed"),Thin("Thin");

  private final String descriptor;

  public String toString() {
    return descriptor;
  }

  Crust(String d) {
    this.descriptor = d;
  }
    
    
}
