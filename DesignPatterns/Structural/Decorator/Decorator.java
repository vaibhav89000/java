
interface Pizza {
    double getCost();
}

class Margherita implements Pizza {
    @Override
    public double getCost() {
        return 250.0;
    }
}

class Farmhouse implements Pizza {
    @Override
    public double getCost() {
        return 300.0;
    }
}

abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class Cheese extends ToppingDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public double getCost() {
        return pizza.getCost() + 40;
    }
}

class Olives extends ToppingDecorator {

    public Olives(Pizza pizza) {
        super(pizza);
    }

    public double getCost() {
        return pizza.getCost() + 20;
    }
}

class Pepperoni extends ToppingDecorator {

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    public double getCost() {
        return pizza.getCost() + 30;
    }
}

public class Decorator {
    public static void main(String[] args) {
       Pizza pizza = new Margherita();
       pizza = new Cheese(pizza);
       pizza = new Olives(pizza);
       pizza = new Pepperoni(pizza);        
       System.out.println("Total cost: " + pizza.getCost());
    }
}