package FactoryPattern;

public class PizzaFactory {
    public static Pizza getPizza(String type)
    {
        if(type.equals("cheese"))
            return new CheesePizza();
        else if(type.equals("veg"))
            return new VegPizza();
        else
            throw new IllegalArgumentException("Unknown pizza type");
    }
}
