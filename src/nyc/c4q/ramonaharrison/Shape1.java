package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Shape.java
 */

public abstract class Shape1 {
    int num_sides;
    public abstract int area();
}

class Rectangle1 extends Shape1 {
    int length;
    int width;

    Rectangle1(int length, int width) {
        num_sides = 4;
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }


}
