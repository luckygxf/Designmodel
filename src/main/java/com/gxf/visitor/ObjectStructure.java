package com.gxf.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/8/19 下午1:43
 **/
public class ObjectStructure {
    private List<Person> persons = new ArrayList<Person>();

    //增加
    public void attach(Person person){
        persons.add(person);
    }

    //移除
    public void detach(Person person){
        persons.remove(person);
    }

    //查看显示
    public void display(Action visitor){
        for(Person person : persons){
            person.accept(visitor);
        }
    }

}
