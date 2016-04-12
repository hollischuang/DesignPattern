package com.hollischuang.pattern.singlenton.lazy;

/**
 * Created by hollis on 16/4/6.
 * 使用静态内部类实现延迟初始化
 */
public class StaticInnerClassSingleton {
    //在静态内部类中初始化实例对象
    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
    //私有的构造方法
    private StaticInnerClassSingleton() {
    }
    //对外提供获取实例的静态方法
    public static final StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
