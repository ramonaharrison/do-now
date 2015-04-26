package nyc.c4q.ramonaharrison;

import java.util.Collection;
import java.util.Iterator;

/**
 * Access Code 2.1
 * Ramona Harrison
 * MyCollection1.java
 */

public class MyCollection1<E> implements java.util.Collection<E>{

    Object[] myArray = new Object[0];

    @Override
    public int size() {
        return myArray.length;
    }

    @Override
    public boolean isEmpty() {
        return (myArray.length == 0);
    }

    @Override
    public boolean contains(Object o) {
        for (Object myObject : myArray) {
            if (myObject.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return myArray;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if (!this.contains(o)) {
            return false;
        }
        Object[] newArray = new Object[myArray.length - 1];
        for (int i = 0; i < myArray.length; i++) {
            if (!myArray[i].equals(o)) {
                newArray[i] = myArray[i];
            }
        }
        myArray = newArray;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
