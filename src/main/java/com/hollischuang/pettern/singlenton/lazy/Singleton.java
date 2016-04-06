package com.hollischuang.pettern.singlenton.lazy;

/**
 * Created by hollis on 16/4/6.
 * 懒汉模式,非线程安全
 */
public class Singleton {
    //定义实例
    private static Singleton instance;
    //私有构造方法
    private Singleton(){}
    //对外提供获取实例的静态方法
    public static Singleton getInstance() {
        //在对象被使用的时候才实例化
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
