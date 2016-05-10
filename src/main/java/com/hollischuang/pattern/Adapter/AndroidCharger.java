package com.hollischuang.pattern.Adapter;

/**
 * Created by hollis on 16/5/10.
 * 安卓设备的充电器
 */
public class AndroidCharger implements MicroUsbInterface {
    @Override
    public void chargeWithMicroUsb() {
        System.out.println("使用MicroUsb型号的充电器充电...");
    }
}
