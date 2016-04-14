package com.hollischuang.pattern.AbstractFactory.factory;

import com.hollischuang.pattern.AbstractFactory.*;

/**
 * Created by hollis on 16/4/14.
 * 商务车工厂类
 */
public class BusinessCarFactory implements CarFactory {
    public BenzCar getBenzCar() {
        return new BenzBusinessCar();
    }

    public TeslaCar getTeslaCar() {
        return new TeslaBusinessCar();
    }
}
