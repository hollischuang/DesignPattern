package com.hollischuang.pattern.FactoryMethod.factory;

import com.hollischuang.pattern.FactoryMethod.Operation;
import com.hollischuang.pattern.FactoryMethod.OperationAdd;

/**
 * Created by hollis on 16/4/12.
 * 加法类工厂
 */
public class AddFactory implements IFactory {

    public Operation CreateOption() {
        return new OperationAdd();
    }
}
