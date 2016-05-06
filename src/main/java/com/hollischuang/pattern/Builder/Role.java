package com.hollischuang.pattern.Builder;

/**
 * Created by hollis on 16/5/3.
 */
public class Role {

    private String head; //头部
    private String face; //脸部（脸部依赖于头部）
    private String body; //身体
    private Double hp;   //生命值
    private Double sp;   //能量值
    private Double mp;   //魔法值


    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public Double getSp() {
        return sp;
    }

    public void setSp(Double sp) {
        this.sp = sp;
    }

    public Double getMp() {
        return mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "Role{" +
                "head='" + head + '\'' +
                ", face='" + face + '\'' +
                ", body='" + body + '\'' +
                ", hp=" + hp +
                ", sp=" + sp +
                ", mp=" + mp +
                '}';
    }
}
