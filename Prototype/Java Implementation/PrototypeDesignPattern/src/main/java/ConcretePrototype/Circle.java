package ConcretePrototype;

import Prototype.Shape;

public class Circle extends Shape {
    public int radius;
    public Circle(Circle target){
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
