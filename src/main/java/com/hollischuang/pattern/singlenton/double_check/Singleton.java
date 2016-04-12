package com.hollischuang.pattern.Singlenton.double_check;

/**
 * Created by hollis on 16/4/6.
 * 双重校验锁,有可见性问题
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
