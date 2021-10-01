package io.patterns.composite.iterators;

import io.patterns.iterator.Iterator;

public class NullIterator<T> implements Iterator<T> {
    public NullIterator() {
        super();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
