package com.gxf.others;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by GuanXF on 2017/12/27.
 * 测试java反射
 */
public class TestReflect {

    private void helloDesignModel(String name, Integer age){
        System.out.println("hello : " + name + ", age : " + age);
    }

    /**
     * 获取Methond对象
     * 调用method.invoke方法
     * */
    @Test
    public void testReflectMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object[] params = new Object[]{"guanxiangfei", 27};
        Class[] paramTypes = new Class[params.length];
        for(int i = 0; i < params.length; i++){
            paramTypes[i] = params[i].getClass();
        }
        String methodName = "helloDesignModel";
        Method method = this.getClass().getDeclaredMethod(methodName, paramTypes);
        //允许访问私有方法
        method.setAccessible(true);
        method.invoke(this, params);
    }

}
