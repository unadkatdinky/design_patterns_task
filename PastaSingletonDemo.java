// Singleton Class
class PastaSauce {
    private static PastaSauce instance;

    private PastaSauce() {
        // private constructor
    }

    public static PastaSauce getInstance() {
        if (instance == null) {
            instance = new PastaSauce();
        }
        return instance;
    }

    public void addSauce() {
        System.out.println("Adding pasta sauce.");
    }
}

// Client
public class PastaSingletonDemo {
    public static void main(String[] args) {
        PastaSauce sauce = PastaSauce.getInstance();
        sauce.addSauce();  // Output: Adding pasta sauce.
        
        PastaSauce anotherSauce = PastaSauce.getInstance();
        anotherSauce.addSauce();  // Output: Adding pasta sauce.
    }
}
