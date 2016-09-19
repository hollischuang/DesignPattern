package com.hollischuang.pattern.Strategy;

/**
 * Created by hollis on 16/9/19. 会员接口
 */
public interface Member {

    /**
     * 计算应付价格
     * 
     * @param bookPrice 书籍原价(针对金额,建议使用BigDecimal,double会损失精度)
     * @return 应付金额
     */
    public double calPrice(double bookPrice);
}
