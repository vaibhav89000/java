interface Shape {
    double area();
}

class Rectangle implements Shape {
    double length = 5;
    double width = 4;

    public double area() {
        return length * width;
    }
}

class Circle implements Shape {
    double radius = 3;

    public double area() {
        return Math.PI * radius * radius;
    }
}

// NEW shape added without modifying existing code ✅
class Triangle implements Shape {
    double base = 4;
    double height = 3;

    public double area() {
        return 0.5 * base * height;
    }
}

class AreaCalculator {
    double calculate(Shape shape) {
        return shape.area();
    }
}

public class OCPExample {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        System.out.println(calc.calculate(new Circle()));
        System.out.println(calc.calculate(new Triangle()));
    }
}
