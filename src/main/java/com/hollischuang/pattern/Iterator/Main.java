package com.hollischuang.pattern.Iterator;

/**
 * Created by hollis on 17/2/18.
 */
public class Main {

    public static void main(String[] args) {
        ChineseFoodMenu chineseFoodMenu = new ChineseFoodMenu();
        chineseFoodMenu.add("宫保鸡丁");
        chineseFoodMenu.add("孜然羊肉");
        chineseFoodMenu.add("水煮鱼");
        chineseFoodMenu.add("北京烤鸭");

        Iterator iterator = chineseFoodMenu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
