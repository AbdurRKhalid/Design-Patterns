import AbstractFactory.GUIFactory;
import Client.Application;
import ConcreteFactory.WindowsOSFactory;

public class Test {
    public static void main(String[] args) {
        Application app;
        GUIFactory factory;

        factory = new WindowsOSFactory();
        app = new Application(factory);
        app.paint();
    }
}
