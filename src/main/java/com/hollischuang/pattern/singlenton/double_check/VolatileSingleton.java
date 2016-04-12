package com.hollischuang.pattern.singlenton.double_check;

/**
 * Created by hollis on 16/4/6.
 */
public class VolatileSingleton {
    private static volatile VolatileSingleton singleton;

    private VolatileSingleton() {
    }

    public static VolatileSingleton getSingleton() {
        if (singleton == null) {
            synchronized (VolatileSingleton.class) {
                if (singleton == null) {
                    singleton = new VolatileSingleton();
                }
            }
        }
        return singleton;
    }
}
