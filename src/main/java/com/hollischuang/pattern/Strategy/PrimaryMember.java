package com.hollischuang.pattern.Strategy;

/**
 * Created by hollis on 16/9/19. 初级会员
 */
public class PrimaryMember implements Member {

    @Override
    public double calPrice(double bookPrice) {
        System.out.println("对于初级会员的没有折扣");
        return bookPrice;
    }
}
