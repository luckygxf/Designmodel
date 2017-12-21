package com.gxf.template;

import org.junit.Test;

/**
 * Created by 58 on 2017/12/21.
 */
public class TestTemplate {

    @Test
    public void testTemplate(){
        TestPaper testPaperA = new TestPaperA();
        TestPaper testPaperB = new TestPaperB();
        testPaperA.testQ1();
        testPaperA.testQ2();
        testPaperA.testQ3();
        System.out.println("------------------line------------------");
        testPaperB.testQ1();
        testPaperB.testQ2();
        testPaperB.testQ3();
    }
}
