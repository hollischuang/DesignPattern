package com.hollischuang.pattern.StaticFactory;

/**
 * Created by hollis on 16/4/11.
 */
public class OperationFactory {

    public static Operation createOperation(String operation) {
        Operation oper = null;
        switch (operation) {

            case "+":
                oper = new OperationAdd();
                break;

            case "-":
                oper = new OperationSub();
                break;

            case "*":
                oper = new OperationMul();
                break;

            case "/":
                oper = new OperationDiv();
                break;
            default:
                throw new UnsupportedOperationException("不支持该操作");
                break;

        }
        return oper;
    }
}
