// Existing interface
interface FrenchFryMachine {
    void makeFries();
}

// New Machine Class (Incompatible interface)
class AdvancedFriesMachine {
    public void cookFries() {
        System.out.println("Cooking fries using advanced machine.");
    }
}

// Adapter Class
class FriesMachineAdapter implements FrenchFryMachine {
    private AdvancedFriesMachine advancedMachine;

    public FriesMachineAdapter(AdvancedFriesMachine machine) {
        this.advancedMachine = machine;
    }

    public void makeFries() {
        advancedMachine.cookFries();
    }
}

// Client
public class AdapterDemo {
    public static void main(String[] args) {
        AdvancedFriesMachine newMachine = new AdvancedFriesMachine();
        FrenchFryMachine adapter = new FriesMachineAdapter(newMachine);
        
        adapter.makeFries();  // Output: Cooking fries using advanced machine.
    }
}
