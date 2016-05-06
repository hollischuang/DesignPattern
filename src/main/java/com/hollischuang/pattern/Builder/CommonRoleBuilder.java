package com.hollischuang.pattern.Builder;

/**
 * Created by hollis on 16/5/3.
 */
public class CommonRoleBuilder extends Builder {

    private Role role = new Role();

    @Override
    public void buildHead() {
        role.setBody("common head");
    }

    @Override
    public void buildFace() {
        role.setFace("common face");
    }

    @Override
    public void buildBody() {
        role.setBody("common body");
    }

    @Override
    public void buildHp() {
        role.setHp(100d);
    }

    @Override
    public void buildSp() {
        role.setSp(100d);
    }

    @Override
    public void buildMp() {
        role.setMp(100d);
    }

    @Override
    public Role getResult() {
        return role;
    }
}
