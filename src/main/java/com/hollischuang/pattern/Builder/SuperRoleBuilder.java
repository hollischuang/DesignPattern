package com.hollischuang.pattern.Builder;

/**
 * Created by hollis on 16/5/3.
 */
public class SuperRoleBuilder extends Builder {

    private Role role = new Role();

    @Override
    public void buildHead() {
        role.setBody("common head");
    }

    @Override
    public void buildBody() {
        role.setBody("common body");
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
    public Role getResule() {
        return getResule();
    }
}
