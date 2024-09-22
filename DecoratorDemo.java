// Component Interface
interface PizzaBase {
    String make();
}

// Concrete Component
class PlainPizza implements PizzaBase {
    public String make() {
        return "Plain Pizza";
    }
}

// Decorator
abstract class PizzaDecorator implements PizzaBase {
    protected PizzaBase pizza;

    public PizzaDecorator(PizzaBase pizza) {
        this.pizza = pizza;
    }

    public String make() {
        return pizza.make();
    }
}

// Concrete Decorators
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(PizzaBase pizza) {
        super(pizza);
    }

    public String make() {
        return super.make() + " + Cheese";
    }
}

class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(PizzaBase pizza) {
        super(pizza);
    }

    public String make() {
        return super.make() + " + Pepperoni";
    }
}

// Client
public class DecoratorDemo {
    public static void main(String[] args) {
        PizzaBase pizza = new PlainPizza();
        PizzaBase cheesePizza = new CheeseDecorator(pizza);
        PizzaBase pepperoniPizza = new PepperoniDecorator(cheesePizza);

        System.out.println(pepperoniPizza.make());  
        // Output: Plain Pizza + Cheese + Pepperoni
    }
}
