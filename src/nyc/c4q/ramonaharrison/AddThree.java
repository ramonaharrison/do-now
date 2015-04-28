package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * AddThree.java
 */

public class AddThree implements Mapper {


    @Override
    public Integer f(Object o) {
        return (Integer)o + 3;
    }
}
