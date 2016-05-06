package com.hollischuang.pattern.Builder;

/**
 * Created by hollis on 16/5/3.
 */
public abstract class Builder {

    protected Role role = new Role();

    public abstract void buildHead();

    public abstract void buildFace();

    public abstract void buildBody();

    public abstract void buildHp();

    public abstract void buildSp();

    public abstract void buildMp();

    public Role getResult() {
        return role;
    }
}
