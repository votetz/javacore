package arrays.list;

public interface IntList {
    int add(int element);

    int get(int index);

    void set(int index, int element);

    int size();

    boolean isEmpty();

    int remove(int index);
}
