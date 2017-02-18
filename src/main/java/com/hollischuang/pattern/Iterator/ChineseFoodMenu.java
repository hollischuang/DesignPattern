package com.hollischuang.pattern.Iterator;

/**
 * Created by hollis on 17/2/18.
 */
public class ChineseFoodMenu implements Menu {

    private String[] foods    = new String[4];
    private int      position = 0;

    @Override
    public void add(String name) {
        foods[position] = name;
        position += 1;
    }

    @Override
    public Iterator getIterator() {
        return new MenuIterator(this.foods);
    }
}
