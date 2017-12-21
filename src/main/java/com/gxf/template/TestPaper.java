package com.gxf.template;

/**
 * Created by 58 on 2017/12/21.
 */
public abstract class TestPaper {
    public void testQ1(){
        System.out.println("Q1: a b c d");
        answer1();
    }
    public void testQ2(){
        System.out.println("Q2: a b c d");
        answer2();
    }
    public void testQ3(){
        System.out.println("Q3: a b c d");
        answer3();
    }

    public abstract void answer1();
    public abstract void answer2();
    public abstract void answer3();
}
