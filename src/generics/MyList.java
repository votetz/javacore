package generics;

public interface MyList<T> {
    T add(T element);

    T get(int index);

    void set(int index, T element);

    int size();

    boolean isEmpty();
}
