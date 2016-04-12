package com.hollischuang.pattern.FactoryMethod.factory;

import com.hollischuang.pattern.FactoryMethod.Operation;
import com.hollischuang.pattern.FactoryMethod.OperationSub;

/**
 * Created by hollis on 16/4/12.
 * 减法类工厂
 */
public class SubFactory implements IFactory {

    public Operation CreateOption() {
        return new OperationSub();
    }
}
