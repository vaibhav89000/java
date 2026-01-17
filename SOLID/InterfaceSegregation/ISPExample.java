interface TwoDShape {
    double area();
}

interface ThreeDShape {
    double volume();
}

class Square implements TwoDShape {
    public double area() {
        return 25;
    }
}

class Cube implements TwoDShape, ThreeDShape {
    public double area() {
        return 150;
    }

    public double volume() {
        return 125;
    }
}

public class ISPExample {
    public static void main(String[] args) {
        TwoDShape square = new Square();
        System.out.println("Square area: " + square.area());

        ThreeDShape cube = new Cube();
        System.out.println("Cube volume: " + cube.volume());
    }
}
