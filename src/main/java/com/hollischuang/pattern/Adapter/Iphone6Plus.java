package com.hollischuang.pattern.Adapter;

/**
 * Created by hollis on 16/5/10.
 */
public class Iphone6Plus {

    private LightningInterface lightningInterface;

    public Iphone6Plus() {
    }

    public Iphone6Plus(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }

    public void charge() {
        System.out.println("开始给我的Iphone6Plus手机充电...");
        lightningInterface.chargeWithLightning();
        System.out.println("结束给我的Iphone6Plus手机充电...");
    }

    public LightningInterface getLightningInterface() {
        return lightningInterface;
    }

    public void setLightningInterface(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }
}