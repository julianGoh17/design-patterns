package io.patterns.adapter;

import java.util.Iterator;

public class IteratorAdapter<T> implements Enumerator<T> {
    private Iterator<T> iterator;

    public IteratorAdapter(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        return iterator.next();
    }
}
