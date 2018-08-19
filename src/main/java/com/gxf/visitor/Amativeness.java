package com.gxf.visitor;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description: 恋爱
 * @Date: Created in : 2018/8/19 下午1:39
 **/
public class Amativeness extends Action {
    public String typeName = "恋爱";

    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getName() + this.typeName +
                "时，凡事不懂也要装懂");
    }

    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getName() + this.typeName +
                "时，遇事懂也装作不懂");
    }
}
