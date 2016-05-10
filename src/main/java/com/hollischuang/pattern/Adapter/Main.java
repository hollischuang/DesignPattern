package com.hollischuang.pattern.Adapter;

/**
 * Created by hollis on 16/5/10.
 */
public class Main {

    public static void main(String[] args) {
        Iphone6Plus iphone6Plus = new Iphone6Plus(new AppleCharger());
        iphone6Plus.charge();

        System.out.println("==============================");

        GalaxyS7 galaxyS7 = new GalaxyS7(new AndroidCharger());
        galaxyS7.charge();

        System.out.println("==============================");

        Adapter adapter  = new Adapter(new AndroidCharger());
        Iphone6Plus newIphone = new Iphone6Plus();
        newIphone.setLightningInterface(adapter);
        newIphone.charge();
    }
}
