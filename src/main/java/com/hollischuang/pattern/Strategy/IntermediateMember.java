package com.hollischuang.pattern.Strategy;

/**
 * Created by hollis on 16/9/19. 中级会员,买书打九折
 */
public class IntermediateMember implements Member {

    @Override
    public double calPrice(double bookPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return bookPrice * 0.9;
    }
}
