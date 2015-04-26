package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Shape.java
 */

public abstract class Shape {
    int num_sides;
    public abstract int area();
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width) {
        num_sides = 4;
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }


}
