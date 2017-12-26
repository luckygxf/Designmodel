package com.gxf.decrotor;

/**
 * Created by 58 on 2017/12/26.
 * 装饰基类
 */
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }

    public Person getComponent() {
        return component;
    }

    public void setComponent(Person component) {
        this.component = component;
    }
}
