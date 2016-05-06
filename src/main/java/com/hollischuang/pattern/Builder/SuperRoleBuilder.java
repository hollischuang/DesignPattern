package com.hollischuang.pattern.Builder;

/**
 * Created by hollis on 16/5/3.
 */
public class SuperRoleBuilder extends Builder {

    private Role role = new Role();

    @Override
    public void buildHead() {
        role.setBody("suoer head");
    }

    @Override
    public void buildFace() {
        role.setFace("super face");
    }

    @Override
    public void buildBody() {
        role.setBody("super body");
    }

    @Override
    public void buildHp() {
        role.setHp(120d);
    }

    @Override
    public void buildSp() {
        role.setSp(120d);
    }

    @Override
    public void buildMp() {
        role.setMp(120d);
    }

    @Override
    public Role getResult() {
        return role;
    }
}
