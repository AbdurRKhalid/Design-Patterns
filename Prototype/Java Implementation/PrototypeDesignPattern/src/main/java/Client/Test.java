package Client;

import ConcretePrototype.Circle;
import Prototype.Shape;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        Circle circle = new Circle();
        circle.radius = 25;
        circle.x = 15;
        circle.y = 25;
        circle.color = "Green";
        shapeList.add(circle);
        Circle clonedCircle = (Circle) circle.clone();
        clonedCircle.color = "Blue";
        System.out.println(circle.color);
        System.out.println(clonedCircle.color);
    }
}
