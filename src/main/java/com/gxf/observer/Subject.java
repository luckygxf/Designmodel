package com.gxf.observer;

/**
 * Created by 58 on 2017/12/26.
 * 订阅的主题
 */
public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notiry();
}
