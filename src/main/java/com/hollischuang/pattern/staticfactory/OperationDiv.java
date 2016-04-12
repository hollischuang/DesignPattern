package com.hollischuang.pattern.staticfactory;

/**
 * Created by hollis on 16/4/11.
 */
public class OperationDiv extends Operation {

    @Override
    protected double getResule() {
        if (getValue2() != 0) {
            return getValue1() / getValue2();
        }
        throw new IllegalArgumentException("除数不能为零");
    }
}
