package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        Coffee coffee=new PlainCoffee();
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

        Coffee milkcoffee=new MilkDecorator(coffee);
        System.out.println(milkcoffee.getDescription());
        System.out.println(milkcoffee.getCost());

        Coffee sugarcoffee=new SugarDecorator(coffee);
        System.out.println(sugarcoffee.getDescription());
        System.out.println(sugarcoffee.getCost());

        sugarcoffee=new SugarDecorator(milkcoffee);
        System.out.println(sugarcoffee.getDescription());
        System.out.println(sugarcoffee.getCost());
    }
}
