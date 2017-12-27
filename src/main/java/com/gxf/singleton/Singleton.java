package com.gxf.singleton;

/**
 * Created by 58 on 2017/12/27.
 * 单例模式 | 懒汉式 | 线程安全
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    //私有化构造函数
    private Singleton() {

    }

    //对外提供获取实例接口
    public static Singleton getInstance(){
        return singleton;
    }
}
