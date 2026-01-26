// The Factory Design Pattern is a creational pattern that provides an interface for creating objects,
//  but lets subclasses or a factory class decide which concrete class to instantiate.

interface Shape {
    void computeArea();
}

class Circle implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Computing area of Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Computing area of Rectangle");
    }
}

class ShapeInstanceFactory {
    public static Shape getShapeInstance(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

public class Factory {
    public static void main(String[] args) {
        Shape shape1 = ShapeInstanceFactory.getShapeInstance("CIRCLE");
        shape1.computeArea();

        Shape shape2 = ShapeInstanceFactory.getShapeInstance("RECTANGLE");
        shape2.computeArea();
    }
}
