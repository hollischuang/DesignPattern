package com.hollischuang.pattern.FactoryMethod;

/**
 * Created by hollis on 16/4/11.
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getValue1() + getValue2();
    }
}
