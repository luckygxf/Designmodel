package com.gxf.singleton;

import org.junit.Test;

/**
 * Created by 58 on 2017/12/27.
 */
public class TestSingleton {

    @Test
    public void test(){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if(instance1 == instance2){
            System.out.println("they are one instance");
        }else{
            System.out.println("they are diffirent instance");
        }
    }
}
