package nyc.c4q.ramonaharrison;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Access Code 2.1
 * Ramona Harrison
 * MyMapReduce.java
 *
 * In a class MyMapReduce, write a method Iterable<V> map(Iterable<E>, Mapper<E,V>).
 * This takes in an iterable collection of Es. For each E in the collection, it applies f()
 * and creates a new iterable collection of Vs. For example, we might want to take
 * in [1, 2, 3] and return [2, 3, 4], or take in [1, 2, 3] and return ['A', 'B', 'C'].
 * map() will allow us to apply the map method to every element in the collection
 * and get back a new collection.
 *
 */

public class MyMapReduce<E, V> {

    public static Iterable map(Iterable iterable, Mapper mapper) {
        ArrayList list = new ArrayList();

        for (Object e: iterable) {
            list.add(mapper.f(e));
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        AddThree mapper = new AddThree();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers.get(0) + " " + numbers.get(1) + " " + numbers.get(2));

        ArrayList<Integer> mappedList = (ArrayList<Integer>) map(numbers, mapper);
        System.out.println(mappedList.get(0) + " " + mappedList.get(1) + " " + mappedList.get(2));
    }

}


