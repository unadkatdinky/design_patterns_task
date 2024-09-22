// Command Interface
interface PizzaOrder {
    void execute();
}

// Concrete Commands
class CheesePizzaOrder implements PizzaOrder {
    public void execute() {
        System.out.println("Making a cheese pizza.");
    }
}

class PepperoniPizzaOrder implements PizzaOrder {
    public void execute() {
        System.out.println("Making a pepperoni pizza.");
    }
}

// Invoker
class PizzaChef {
    private PizzaOrder pizzaOrder;

    public void takeOrder(PizzaOrder order) {
        this.pizzaOrder = order;
    }

    public void makePizza() {
        this.pizzaOrder.execute();
    }
}

// Client
public class PizzaCommandDemo {
    public static void main(String[] args) {
        PizzaChef chef = new PizzaChef();
        PizzaOrder cheeseOrder = new CheesePizzaOrder();
        PizzaOrder pepperoniOrder = new PepperoniPizzaOrder();

        chef.takeOrder(cheeseOrder);
        chef.makePizza();  // Output: Making a cheese pizza.

        chef.takeOrder(pepperoniOrder);
        chef.makePizza();  // Output: Making a pepperoni pizza.
    }
}
