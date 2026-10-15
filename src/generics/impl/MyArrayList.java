package generics.impl;

import generics.MyList;

public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: "
                    + initialCapacity);
        }
        elements = new Object[initialCapacity];
        size = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void grow() {
        int newCapacity = elements.length * 2;
        int lengthArray = elements.length;
        if (newCapacity < 0) {
            if (lengthArray == Integer.MAX_VALUE) {
                throw new OutOfMemoryError();
            }
            newCapacity = Integer.MAX_VALUE;
        }

        if (newCapacity == 0) {
            newCapacity = 1;
        }

        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    @Override
    public T add(T element) {
        if (size == elements.length) {
            grow();
        }

        this.elements[size] = element;
        size++;

        return element;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    @Override
    public void set(int index, T element) {
        checkIndex(index);
        elements[index] = element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}