package com.gxf.observer;

/**
 * Created by 58 on 2017/12/26.
 */
public class Client {
    public static void main(String[] args) {
        Subject boss = new Boss();
        StockObserver guanxianseng = new StockObserver();
        boss.attach(guanxianseng);
        NBAObserver zhangshan = new NBAObserver();
        boss.attach(zhangshan);
        boss.notiry();
    }
}
