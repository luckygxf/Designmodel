package com.gxf.visitor;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/8/19 下午1:30
 **/
public abstract class Action {
    public String typeName;

    //得到男人结论或反应
    public abstract void getManConclusion(Man concreteElementA);

    //得到女人结论或反应
    public abstract void getWomanConclusion(Woman concreteElementB);

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
