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
public abstract class PizzaBuilder<T extends PizzaBuilder<T>> {

    protected Crust crust;
    protected Size size;
    protected Map<ToppingName, ToppingPortion> toppings;
  protected   ToppingPortion leftHalf;
  protected   ToppingPortion rightHalf;

    public PizzaBuilder setCrust(Crust crust) {
        this.crust = crust;
        return this.returnBuilder();
    }

    public PizzaBuilder setSize(Size size) {
        this.size = size;

        return this;
    }

    
    public PizzaBuilder leftHalfPizza(ToppingPortion leftHalf){
        this.leftHalf = leftHalf;

        return this;
    }
    
    
    PizzaBuilder returnBuilder(){
        return this;
    }
    
    
    
    public PizzaBuilder rightHalfPizza(ToppingPortion rightHalf){
        this.rightHalf = rightHalf;

        
        return this;
    }
    
    
    
    
    
    
    
    public PizzaBuilder addTopping(Map<ToppingName, ToppingPortion> toppings) {
        this.toppings = toppings;

        return this;
    }
    
    public AlaCartePizza build() {
            return new AlaCartePizza();
        }
        

}
