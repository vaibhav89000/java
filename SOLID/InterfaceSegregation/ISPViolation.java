// “Earlier, a single Shape interface forced 2D shapes to implement volume, violating Interface Segregation Principle.
// By splitting interfaces into TwoDShape and ThreeDShape, each class implements only what it needs.
// This makes the design cleaner, safer, and more extensible.”

interface Shape {
    double area();
    double volume();   // ❌ Not applicable for 2D shapes
}

class Square implements Shape {
    public double area() {
        return 25;
    }

    public double volume() {
        throw new UnsupportedOperationException("2D shape has no volume");
    }
}

class Cube implements Shape {
    public double area() {
        return 150;
    }

    public double volume() {
        return 125;
    }
}

public class ISPViolation {
    public static void main(String[] args) {
        Shape square = new Square();
        System.out.println(square.area());
        // square.volume(); ❌ runtime exception
    }
}
