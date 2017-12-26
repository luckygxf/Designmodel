package com.gxf.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 58 on 2017/12/26.
 */
public class Boss implements Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void notiry() {
        for(Observer observer : observerList){
            observer.update(10);
        }
    }
}
