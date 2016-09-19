package com.hollischuang.pattern.Strategy;

/**
 * Created by hollis on 16/9/19. 高级会员,买书打八折
 */
public class AdvancedMember implements Member {

    @Override
    public double calPrice(double bookPrice) {
        System.out.println("对于中级会员的折扣为20%");
        return bookPrice * 0.8;
    }
}
