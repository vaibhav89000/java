// “Earlier, AreaCalculator had to be modified whenever a new shape was added.
// By introducing a Shape interface, I made the system extensible.
// Now adding a new shape only requires creating a new class, without touching existing logic.”

class AreaCalculator {

    double calculate(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.length * r.width;
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.radius * c.radius;
        }
        // Adding Triangle? Modify this class ❌
        return 0;
    }
}

class Rectangle {
    double length, width;
}

class Circle {
    double radius;
}

public class OCPViolation {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        System.out.println(calc.calculate(new Circle()));
    }
}
