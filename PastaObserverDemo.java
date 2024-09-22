import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Customer {
    void update(String pasta);
}

// Subject Interface
interface PastaMenu {
    void addCustomer(Customer customer);
    void removeCustomer(Customer customer);
    void notifyCustomers();
}

// Concrete Subject
class RestaurantPastaMenu implements PastaMenu {
    private List<Customer> customers = new ArrayList<>();
    private String newPasta;

    public void setNewPasta(String pasta) {
        this.newPasta = pasta;
        notifyCustomers();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void notifyCustomers() {
        for (Customer customer : customers) {
            customer.update(newPasta);
        }
    }
}

// Concrete Observer
class PastaLover implements Customer {
    private String name;

    public PastaLover(String name) {
        this.name = name;
    }

    public void update(String pasta) {
        System.out.println(name + " has been notified of new pasta: " + pasta);
    }
}

// Client
public class PastaObserverDemo {
    public static void main(String[] args) {
        RestaurantPastaMenu menu = new RestaurantPastaMenu();

        Customer john = new PastaLover("John");
        Customer mary = new PastaLover("Mary");

        menu.addCustomer(john);
        menu.addCustomer(mary);

        menu.setNewPasta("Spaghetti Bolognese");
        // Output: John has been notified of new pasta: Spaghetti Bolognese.
        //         Mary has been notified of new pasta: Spaghetti Bolognese.

        menu.setNewPasta("Penne Arrabiata");
        // Output: John has been notified of new pasta: Penne Arrabiata.
        //         Mary has been notified of new pasta: Penne Arrabiata.
    }
}
