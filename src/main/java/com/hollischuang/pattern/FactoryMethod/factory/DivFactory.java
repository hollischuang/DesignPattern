package com.hollischuang.pattern.FactoryMethod.factory;

import com.hollischuang.pattern.FactoryMethod.Operation;
import com.hollischuang.pattern.FactoryMethod.OperationDiv;

/**
 * Created by hollis on 16/4/12.
 * 除法类工厂
 */
public class DivFactory implements IFactory {

    public Operation CreateOption() {
        return new OperationDiv();
    }
}
