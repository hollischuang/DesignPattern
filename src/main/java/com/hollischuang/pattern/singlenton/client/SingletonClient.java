package com.hollischuang.pattern.singlenton.client;

import com.hollischuang.pattern.singlenton.hangry.Singleton;

/**
 * Created by hollis on 16/4/6.
 */
public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
