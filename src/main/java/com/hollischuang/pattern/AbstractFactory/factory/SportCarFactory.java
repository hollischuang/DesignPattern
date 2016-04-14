package com.hollischuang.pattern.AbstractFactory.factory;

import com.hollischuang.pattern.AbstractFactory.BenzCar;
import com.hollischuang.pattern.AbstractFactory.BenzSportCar;
import com.hollischuang.pattern.AbstractFactory.TeslaCar;
import com.hollischuang.pattern.AbstractFactory.TeslaSportCar;

/**
 * Created by hollis on 16/4/14.
 * 跑车工厂类
 */
public class SportCarFactory implements CarFactory {
    public BenzCar getBenzCar() {
        return new BenzSportCar();
    }

    public TeslaCar getTeslaCar() {
        return new TeslaSportCar();
    }
}
