package com.hollischuang.pattern.Builder;

/**
 * Created by hollis on 16/5/3.
 */
public class Director {

    public void construct(Builder builder){
        builder.buildBody();
        builder.buildHead();
        builder.buildFace();
        builder.buildHp();
        builder.buildMp();
        builder.buildSp();
    }
}
