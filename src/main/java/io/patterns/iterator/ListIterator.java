package io.patterns.iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int index;

    public ListIterator(List<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        T object = list.get(index);
        index += 1;
        return object;
    }
}
