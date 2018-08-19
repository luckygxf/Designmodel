package com.gxf.visitor;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/8/19 下午1:26
 **/
public class Man extends Person {

    public Man() {
        super.name = "男人";
    }

    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
