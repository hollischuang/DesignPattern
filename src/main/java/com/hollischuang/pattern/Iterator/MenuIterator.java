package com.hollischuang.pattern.Iterator;

/**
 * Created by hollis on 17/2/18.
 */
public class MenuIterator implements Iterator {

    String[] foods;
    int      position = 0;

    public MenuIterator(String[] foods){
        this.foods = foods;
    }

    @Override
    public boolean hasNext() {

        return position != foods.length;
    }

    @Override
    public Object next() {
        String food = foods[position];
        position += 1;
        return food;
    }
}
