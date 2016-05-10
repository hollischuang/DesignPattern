package com.hollischuang.pattern.Adapter;

/**
 * Created by hollis on 16/5/10.
 * 适配器,将MicroUsb接口转成Lightning接口
 */
public class Adapter implements LightningInterface {
    private MicroUsbInterface microUsbInterface;

    public Adapter() {
    }

    public Adapter(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    @Override
    public void chargeWithLightning() {
        microUsbInterface.chargeWithMicroUsb();
    }

    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}
