package com.gxf.visitor;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/8/19 下午1:31
 **/
public class Woman extends Person {

    public Woman() {
        super.name = "女人";
    }

    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
