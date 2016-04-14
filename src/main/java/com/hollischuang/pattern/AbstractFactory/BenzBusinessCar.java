package com.hollischuang.pattern.AbstractFactory;

/**
 * Created by hollis on 16/4/14.
 * 本次跑车
 */
public class BenzBusinessCar implements BenzCar{

    public void gasUp() {
        System.out.println("给我的奔驰商务车加一般的汽油");
    }
}
