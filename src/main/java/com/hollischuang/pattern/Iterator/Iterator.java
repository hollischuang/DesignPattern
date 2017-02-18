package com.hollischuang.pattern.Iterator;

/**
 * Created by hollis on 17/2/18.
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();

    default void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
