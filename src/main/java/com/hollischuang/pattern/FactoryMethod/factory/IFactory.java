package com.hollischuang.pattern.FactoryMethod.factory;

import com.hollischuang.pattern.FactoryMethod.Operation;

/**
 * Created by hollis on 16/4/12.
 * 工厂接口
 */
public interface IFactory {
    Operation CreateOption();
}
