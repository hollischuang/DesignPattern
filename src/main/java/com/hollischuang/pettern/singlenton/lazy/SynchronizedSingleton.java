package com.hollischuang.pettern.singlenton.lazy;

/**
 * Created by hollis on 16/4/6.
 * 懒汉模式,线程安全
 */
public class SynchronizedSingleton {
    //定义实例
    private static SynchronizedSingleton instance;
    //私有构造方法
    private SynchronizedSingleton(){}
    //对外提供获取实例的静态方法,对该方法加锁
    public static synchronized SynchronizedSingleton getInstance() {
        //在对象被使用的时候才实例化
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
