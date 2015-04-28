package nyc.c4q.ramonaharrison;

import java.util.AbstractQueue;
import java.util.Iterator;

/**
 * Access Code 2.1
 * Ramona Harrison
 * MyQueue.java
 */
public class MyQueue<E> extends AbstractQueue<E> {

    Object[] queue;

    public MyQueue() {
        this.queue = new Object[0];
    }

    public MyQueue(int size) {
        this.queue = new Object[size];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return queue.length;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
