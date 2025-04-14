package Assignment2;

import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void add(T item) {
        addLast(item);
    }

    public void add(int index, T item) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            Node current = nodeAt(index);
            Node newNode = new Node(item);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void set(int index, T item) {
        Node current = nodeAt(index);
        current.data = item;
    }

    public void addFirst(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T item) {
        Node newNode = new Node(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public T get(int index) {
        return nodeAt(index).data;
    }

    public T getFirst() {
        return head.data;
    }

    public T getLast() {
        return tail.data;
    }

    public T remove(int index) {
        Node toRemove = nodeAt(index);
        unlink(toRemove);
        return null;
    }

    public void removeFirst() {
        if (head == null) return;
        unlink(head);
    }

    public void removeLast() {
        if (tail == null) return;
        unlink(tail);
    }

    public void sort() {
        if (size < 2) return;
        for (int i = 0; i < size - 1; i++) {
            Node current = head;
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>) current.data).compareTo(current.next.data) > 0) {
                    T temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
                current = current.next;
            }
        }
    }

    public int indexOf(Object object) {
        Node current = head;
        for (int i = 0; current != null; i++) {
            if (current.data.equals(object)) return i;
            current = current.next;
        }
        return -1;
    }

    public int lastIndexOf(Object object) {
        Node current = tail;
        for (int i = size - 1; current != null; i--) {
            if (current.data.equals(object)) return i;
            current = current.prev;
        }
        return -1;
    }

    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node current = head;

            public boolean hasNext() {
                return current != null;
            }

            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    private Node nodeAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private void unlink(Node node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }

        size--;
    }
}
