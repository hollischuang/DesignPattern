package com.hollischuang.pattern.staticfactory;

/**
 * Created by hollis on 16/4/11.
 */
public class Main {

    public static void main(String[] args) {
//        OperationAdd operationAdd = new OperationAdd();
//        operationAdd.setValue1(10);
//        operationAdd.setValue2(5);
//        System.out.println(operationAdd.getResule());


        Operation operationAdd = OperationFactory.createOperation("+");
        operationAdd.setValue1(10);
        operationAdd.setValue2(5);
        System.out.println(operationAdd.getResule());
    }
}
