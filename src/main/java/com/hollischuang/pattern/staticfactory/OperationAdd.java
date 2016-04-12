package com.hollischuang.pattern.staticfactory;

/**
 * Created by hollis on 16/4/11.
 */
public class OperationAdd extends Operation {

    @Override
    protected double getResule() {
        return getValue1() + getValue2();
    }
}
