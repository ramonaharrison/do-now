package nyc.c4q.ramonaharrison;

import java.util.Collection;
import java.util.Iterator;

/**
 * Access Code 2.1
 * Ramona Harrison
 * MyCollection1.java
 */

public class MyCollection<E> implements java.util.Collection<E>{

    Object[] myArray = new Object[0];

    @Override
    public String toString() {
        String contents = "[";
        for (int i = 0; i < myArray.length - 1; i++) {
            contents += myArray[i] + ", ";
        }
        if (myArray.length > 0) {
            contents += myArray[myArray.length - 1];
        }
        return contents + "] size: " + this.size();
    }

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
        Object[] newArray = new Object[myArray.length + 1];
        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        newArray[newArray.length-1] = e;
        myArray = newArray;
        return true;
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
        for (Object object : c) {
            if (!this.contains(object)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        int i;
        Object[] newArray = new Object[myArray.length + c.size()];
        for (i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        for (Object object : c) {
            newArray[i] = object;
            i++;
        }
        myArray = newArray;
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Object[] tempArray = new Object[myArray.length];
        int size = 0;
        for (int i = 0; i < myArray.length; i++) {

            if (!c.contains(myArray[i])) {
                tempArray[size] = myArray[i];
                size++;
            }

        }
        Object[] newArray = new Object[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = tempArray[i];
        }
        myArray = newArray;
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        Object[] tempArray = new Object[myArray.length];
        int size = 0;
        for (int i = 0; i < myArray.length; i++) {

            if (c.contains(myArray[i])) {
                tempArray[size] = myArray[i];
                size++;
            }

        }
        Object[] newArray = new Object[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = tempArray[i];
        }
        myArray = newArray;
        return true;
    }

    @Override
    public void clear() {
        Object[] newArray = new Object[0];
        myArray = newArray;
    }
}