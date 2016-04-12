package com.hollischuang.pattern.singlenton.Serializable;

/**
 * Created by hollis on 16/4/6.
 * 不会被序列化破坏的单例
 */
public class Singleton {

    private volatile static Singleton singleton;
    private Singleton (){}
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

    private Object readResolve() {
        return singleton;
    }
}
