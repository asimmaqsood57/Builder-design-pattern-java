/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterpizza;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author M.Asim Maqsood
 */
public class AlaCartePizza implements observablePizza {

    protected Crust crust;
    protected Size size;
    protected Map<ToppingName, ToppingPortion> toppings;

    public AlaCartePizza() {  // default constructor
        crust = null;
        size = null;
    }

    private AlaCartePizza(AlaCartePizzaBuilder obj) {
        this.crust = obj.crust;
        this.size = obj.size;
        this.toppings = obj.toppings;

    }

    public void addTopping(ToppingName name, ToppingPortion portion) {
        this.toppings.put(name, portion);
    }

    public AlaCartePizza(Size size, Crust crust) {

        try {

            if (size != null && crust != null) {
                this.crust = crust;
                this.size = size;

                this.toppings = new HashMap<ToppingName, ToppingPortion>();

            } else {
                throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e);
            throw new IllegalArgumentException();

        }

    }

    @Override
    public ToppingPortion hasTopping(ToppingName name) {
        return this.toppings.getOrDefault(name, null);
    }

    @Override
    public double cost() {
        double cost = 0.0;
        for (Map.Entry<ToppingName, ToppingPortion> item : this.toppings.entrySet()) {
            cost += item.getKey().getCost() * item.getValue().getCostMultiplier();
        }
        return cost + this.size.getBaseCost();
    }

    public static class AlaCartePizzaBuilder extends PizzaBuilder<AlaCartePizzaBuilder> {

        public AlaCartePizza build() {
            return new AlaCartePizza(this);
        }
        
        
        protected AlaCartePizzaBuilder returnBuilder(){
            
            return this;
            
            
        }
        
       

    }

}
