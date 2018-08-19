package com.gxf.visitor;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/8/19 下午1:46
 **/
public class Main {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //成功时的反应
        Success success = new Success();
        objectStructure.display(success);

        //失败时的反应
        Failing failing = new Failing();
        objectStructure.display(failing);

        //恋爱时的反应
        Amativeness amativeness = new Amativeness();
        objectStructure.display(amativeness);

        //结婚时的反应
        Marriage marriage = new Marriage();
        objectStructure.display(marriage);

    }
}
