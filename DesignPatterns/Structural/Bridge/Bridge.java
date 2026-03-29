

// The Bridge pattern decouples abstraction from implementation, so that both can vary independently.
// This solved N*M problem where we have N shapes and M colors, without bridge we would have to create N*M classes for each shape-color combination, but with bridge we can create N shape classes and M color classes and bridge them together.
// This can solve in N+M classes instead of N*M classes using bridge pattern.
interface Color {
    void applyColor();
}

class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}

class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}

abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Circle with ");
        color.applyColor();
    }
}

class Square extends Shape {
    public Square(Color color){
        super(color);
    }

    @Override
    void draw(){
        System.out.print("Drawing Square with ");
        color.applyColor();
    }
}


public class Bridge {

    public static void main(String[] args) {    
        Color redColor = new RedColor();
        Square squareShape = new Square(redColor);
        squareShape.draw();
    }

}
