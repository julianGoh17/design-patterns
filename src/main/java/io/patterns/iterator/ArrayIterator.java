package io.patterns.iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private final T[] array;
    private int index;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < array.length;
    }

    @Override
    public T next() {
        T object = this.array[this.index];
        this.index += 1;
        return object;
    }
}
