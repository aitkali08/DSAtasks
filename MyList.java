package Assignment2;

public interface MyList<T> extends Iterable<T> {
    void add(T item);
    void set(int index, T item);
    void add(int index, T item);
    void addFirst(T item);
    void addLast(T item);
    T get(int index);
    T getFirst();
    T getLast();
    void removeFirst();
    default boolean isEmpty() {
        return size() == 0;
    }
    T remove(int index);
    void removeLast();
    void sort(); 
    int indexOf(Object object);
    int lastIndexOf(Object object);
    boolean exists(Object object);
    Object[] toArray();
    void clear();
    int size();
}
 
