package io.patterns.adapter;

public interface Enumerator<T> {
    boolean hasNext();

    T next();
}
