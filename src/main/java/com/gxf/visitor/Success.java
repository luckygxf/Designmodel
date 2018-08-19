package com.gxf.visitor;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/8/19 下午1:33
 **/
public class Success extends Action {
    public String typeName = "成功";


    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getName() + this.typeName +
                             "时，背后多半有一个伟大的女人");
    }

    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getName() + this.typeName +
                "时，背后多半有一个不成功的男人");
    }

    @Override
    public String getTypeName() {
        return typeName;
    }

    @Override
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
