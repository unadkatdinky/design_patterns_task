// Product Interface
interface Pizza {
    void prepare();
}

// Concrete Products
class MargheritaPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Margherita Pizza.");
    }
}

class BBQPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing BBQ Pizza.");
    }
}

// Factory
class PizzaFactory {
    public Pizza getPizza(String type) {
        if (type.equalsIgnoreCase("Margherita")) {
            return new MargheritaPizza();
        } else if (type.equalsIgnoreCase("BBQ")) {
            return new BBQPizza();
        }
        return null;
    }
}

// Client
public class PizzaFactoryDemo {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza1 = pizzaFactory.getPizza("Margherita");
        pizza1.prepare();  // Output: Preparing Margherita Pizza.

        Pizza pizza2 = pizzaFactory.getPizza("BBQ");
        pizza2.prepare();  // Output: Preparing BBQ Pizza.
    }
}
