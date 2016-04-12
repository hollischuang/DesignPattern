package com.hollischuang.pattern.FactoryMethod.client;

import com.hollischuang.pattern.FactoryMethod.Operation;
import com.hollischuang.pattern.FactoryMethod.factory.AddFactory;
import com.hollischuang.pattern.FactoryMethod.factory.IFactory;

/**
 * Created by hollis on 16/4/12.
 */
public class Main {

    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operationAdd =  factory.CreateOption();
        operationAdd.setValue1(10);
        operationAdd.setValue2(5);
        System.out.println(operationAdd.getResult());
    }
}
