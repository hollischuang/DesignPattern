package com.hollischuang.pattern.AbstractFactory.client;
import com.hollischuang.pattern.AbstractFactory.TeslaCar;
import com.hollischuang.pattern.AbstractFactory.factory.SportCarFactory;

/**
 * Created by hollis on 16/4/12.
 */
public class Main {

    public static void main(String[] args) {

        SportCarFactory sportCarFactory = new SportCarFactory();
        TeslaCar teslaCar = sportCarFactory.getTeslaCar();
        teslaCar.charge();

    }
}
