package nyc.c4q.ramonaharrison;

import java.util.ArrayList;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Ship.java
 */

public class Ship {
    private String name;
    private String yearBuilt;

    public Ship() {
        this.name = "no name";
        this.yearBuilt = "no year";
    }

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public String toString() {
        return "I'm a " + getClass().getSimpleName() + " and my name is " + this.getName() + ": " + this.getYearBuilt();
    }

    public static void main(String[] args) {

        ArrayList<Ship> ships = new ArrayList<Ship>();

        Ship ship1 = new Ship("Big Boat", "1995");
        Ship ship2 = new Ship("Fishing Boat", "2002");
        CruiseShip cruise1 = new CruiseShip("Cruiser", "1950", 500);
        CruiseShip cruise2 = new CruiseShip("Floaty", "2000", 4500);
        CargoShip cargo1 = new CargoShip("Barge", "1945", 10000);
        CargoShip cargo2 = new CargoShip("Marge", "1947", 10000);

        ships.add(ship1);
        ships.add(ship2);
        ships.add(cruise1);
        ships.add(cruise2);
        ships.add(cargo1);
        ships.add(cargo2);

        for (Ship ship: ships) {
            System.out.println(ship);
        }

    }

}
