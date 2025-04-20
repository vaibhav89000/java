public class MethodOverloading {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading calc = new MethodOverloading();

        System.out.println("Add 2 ints: " + calc.add(5, 10));           // 15
        System.out.println("Add 3 ints: " + calc.add(5, 10, 15));       // 30
        System.out.println("Add 2 doubles: " + calc.add(5.5, 3.2));     // 8.7
    }
}
