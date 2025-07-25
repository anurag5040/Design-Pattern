package SingletonDesignPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton()
    {
        System.out.println("New instance created");
    }

    public static synchronized Singleton getInstance()
    {
        if(instance==null)
            instance=new Singleton();

        return instance;
    }

    public void doSomething()
    {
        System.out.println("Doing something");
    }
}
