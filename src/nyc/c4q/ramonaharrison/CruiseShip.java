package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * CruiseShip.java
 */

public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip() {
        super();
        this.maxPassengers = 0;
    }

    public CruiseShip(String name, String yearBuilt, int maxPassangers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassangers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "I'm a " + getClass().getSimpleName() + " and my name is " + this.getName() + ": " + this.getMaxPassengers();
    }

}
