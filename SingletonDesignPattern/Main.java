package SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        Singleton s=Singleton.getInstance();
        s.doSomething();

        Singleton s2=Singleton.getInstance();
        s2.doSomething();
    }
}
