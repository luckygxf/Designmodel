package com.gxf.observer;

/**
 * Created by 58 on 2017/12/26.
 */
public class NBAObserver implements Observer {
    public void update(int state) {
        System.out.println("state update to: " + state);
    }
}
