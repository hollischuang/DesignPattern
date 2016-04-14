package com.hollischuang.pattern.AbstractFactory;

/**
 * Created by hollis on 16/4/14.
 */
public class TeslaSportCar implements TeslaCar {
    public void charge() {
        System.out.println("给我特斯拉跑车冲满电");
    }
}
