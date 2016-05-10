package com.hollischuang.pattern.Adapter;

/**
 * Created by hollis on 16/5/10.
 */
public class AppleCharger implements LightningInterface {
    @Override
    public void chargeWithLightning() {
        System.out.println("使用Lightning给Apple设备充电...");
    }
}
