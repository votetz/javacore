package arrays.list.impl;

import arrays.list.IntList;

public class IntArrayList implements IntList {
    private int[] elements;
    private int size;

    public IntArrayList() {
        elements = new int[10];
        size = 0;
    }

    public IntArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        elements = new int[initialCapacity];
        size = 0;
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

        int[] newElements = new int[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    @Override
    public int add(int element) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = element;
        return element;
    }

    public int add(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (size == elements.length) {
            grow();
        }

        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
        return element;
    }

    public boolean removeElement(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int get(int index) {
        checkIndex(index);
        return elements[index];
    }

    @Override
    public void set(int index, int element) {
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

    @Override
    public int remove(int index) {
        checkIndex(index);
        int removedElement = elements[index];
        int elementsToMove = size - index - 1;
        if (elementsToMove > 0) {
            System.arraycopy(elements, index + 1, elements, index, elementsToMove);
        }
        elements[size - 1] = 0;
        size--;
        return removedElement;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
