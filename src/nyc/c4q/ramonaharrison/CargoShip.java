package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * CargoShip.java
 */

public class CargoShip extends Ship {
    private int tonnage;

    public CargoShip() {
        super();
        this.tonnage = 0;
    }

    public CargoShip(String name, String yearBuilt, int tonnage) {
        super(name, yearBuilt);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "I'm a " + getClass().getSimpleName() + " and my name is " + this.getName() + ": " + this.getTonnage();
    }
}
