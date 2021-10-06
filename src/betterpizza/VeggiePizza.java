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
public class VeggiePizza extends AlaCartePizza {

    protected Crust crust;
    protected Size size;
    protected Map<ToppingName, ToppingPortion> toppings;

    public VeggiePizza(Size size, Crust crust) {
        super(size, crust);
        this.addTopping(ToppingName.Cheese, ToppingPortion.Full);
        this.addTopping(ToppingName.Sauce, ToppingPortion.Full);
        this.addTopping(ToppingName.BlackOlive, ToppingPortion.Full);
        this.addTopping(ToppingName.GreenPepper, ToppingPortion.Full);
        this.addTopping(ToppingName.Onion, ToppingPortion.Full);
        this.addTopping(ToppingName.Jalapeno, ToppingPortion.Full);
        this.addTopping(ToppingName.Tomato, ToppingPortion.Full);
    }

    private VeggiePizza(VeggiePizzaBuilder obj) {

        this.crust = obj.crust;
        this.size = obj.size;
        this.toppings = obj.toppings;
        
        
        
        
        
    }

    public static abstract class VeggiePizzaBuilder<T extends VeggiePizzaBuilder> {

        protected Crust crust;
        protected Size size;
        protected Map<ToppingName, ToppingPortion> toppings;

        public VeggiePizzaBuilder Crust(Crust crust) {
            this.crust = crust;
            return this.returnBuilder();
        }
        
        protected VeggiePizzaBuilder returnBuilder(){
            return this;
        }

        public VeggiePizza build() {
            return new VeggiePizza(this);
        }

        public VeggiePizzaBuilder Size(Size size) {
            this.size = size;
            return this.returnBuilder();
        }

    }

}
