package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Pizza pizza=PizzaFactory.getPizza("cheese");
        pizza.prepare();

        Pizza pizza1=PizzaFactory.getPizza("veg");
        pizza1.prepare();

        try {
            Pizza pizza2 = PizzaFactory.getPizza("icecream");
            pizza.prepare();
        } catch (Exception e) {
            System.out.println("Sorry, we don't make that type of pizza!");
        }
    }
}
