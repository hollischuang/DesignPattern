package com.hollischuang.pattern.AbstractFactory.factory;

import com.hollischuang.pattern.AbstractFactory.BenzCar;
import com.hollischuang.pattern.AbstractFactory.TeslaCar;

/**
 * Created by hollis on 16/4/14.
 * 工厂接口
 */
public interface CarFactory {

    public BenzCar getBenzCar();
    public TeslaCar getTeslaCar();
}
