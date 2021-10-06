/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterpizza;

import java.util.Map;

/**
 *
 * @author M.Asim Maqsood
 */
public class CheesePizza extends AlaCartePizza {
    
      /**
   * Create a cheese pizza of the specified size with the specified crust.
   * @param size the size of this pizza
   * @param crust the crust of this pizza
   */
  public CheesePizza(Size size, Crust crust) {
    super(size, crust);
    this.addTopping(ToppingName.Cheese, ToppingPortion.Full);
    this.addTopping(ToppingName.Sauce, ToppingPortion.Full);
  }


  
  
    private CheesePizza(CheesePizzaBuilder obj) {

        this.crust = obj.crust;
        this.size = obj.size;
        this.toppings = obj.toppings;
        
        
        
        
        
    }

    public static class CheesePizzaBuilder {

        protected Crust crust;
        protected Size size;
        protected Map<ToppingName, ToppingPortion> toppings;

        public CheesePizzaBuilder Crust(Crust crust) {
            this.crust = crust;
            return this.returnBuilder();
        }

        public CheesePizza build() {
            return new CheesePizza(this);
        }

        public CheesePizzaBuilder Size(Size size) {
            this.size = size;
            return this.returnBuilder();
        }
        
        
        protected CheesePizzaBuilder returnBuilder(){
            return this;
        } 
        
        

    }

  
  
  



  
    
    
    
}
