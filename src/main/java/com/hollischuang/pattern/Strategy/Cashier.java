package com.hollischuang.pattern.Strategy;

/**
 * Created by hollis on 16/9/19. 书籍价格类
 */
public class Cashier {

    /**
     * 会员,策略对象
     */
    private Member member;

    public Cashier(Member member){
        this.member = member;
    }

    /**
     * 计算应付加个
     * 
     * @param booksPrice
     * @return
     */
    public double quote(double booksPrice) {
        return this.member.calPrice(booksPrice);
    }
}
