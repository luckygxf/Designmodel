package com.gxf.adapter;

import org.junit.Test;

/**
 * Created by 58 on 2017/12/28.
 */
public class TestAdapter {

    //测试适配器模式
    @Test
    public void test(){
        SpecialRequest specialRequest = new SpecialRequest();
        Request request = new AdapterRequest(specialRequest);
        request.request();
    }
}
