package com.gxf.visitor;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/8/19 下午1:36
 **/
public class Failing extends Action {
    public String typeName = "失败";

    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getName() + this.typeName +
                "时，闷头喝酒谁也不用劝");
    }

    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getName() + this.typeName +
                "时，眼泪汪汪，谁也劝不了");
    }
}
