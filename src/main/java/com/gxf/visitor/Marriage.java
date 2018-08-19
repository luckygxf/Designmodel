package com.gxf.visitor;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/8/19 下午1:56
 **/
public class Marriage extends Action {
    public String typeName = "结婚";

    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getName() + this.typeName +
                "时，被判有妻徒刑");
    }

    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getName() + this.typeName +
                "时，买了个保险~");
    }
}
