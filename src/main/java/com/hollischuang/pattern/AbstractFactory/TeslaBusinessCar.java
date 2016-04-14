package com.hollischuang.pattern.AbstractFactory;

/**
 * Created by hollis on 16/4/14.
 */
public class TeslaBusinessCar implements TeslaCar {
    public void charge() {
        System.out.println("不用给我特斯拉商务车冲满电");
    }
}
