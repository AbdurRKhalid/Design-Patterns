package Client;

import Singleton.Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton firstObject = Singleton.getInstance("First Object");
        Singleton secondObject = Singleton.getInstance("Second Object");
        System.out.println(firstObject.value);
        System.out.println(secondObject.value);
    }
}
