package io.patterns.adapter;

import java.util.ArrayList;

public class ArrayListEnumerator<T> implements Enumerator<T> {
    private ArrayList<T> list;
    private int index;

    public ArrayListEnumerator(ArrayList<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        T element = list.get(index);
        index += 1;
        return element;
    }
}
