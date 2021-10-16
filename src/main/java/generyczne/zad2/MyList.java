package generyczne.zad2;

import java.util.Arrays;

public class MyList<E> {
    private int n;
    private E[] table;

    public MyList(int n) {
        this.n = n;
        this.table = (E[]) new Object[n];
    }

    public boolean contains(E element) {
        for (int i = 0; i < table.length; i++) {
            if (element.equals(table[i])) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        int counter = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public boolean add(E element) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                table[i] = element;
                return true;
            }
        }
        return false;
    }

    public E getElement(int n) {
        if (n < this.n) {
            return table[n];
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return Arrays.toString(table);
    }
}
