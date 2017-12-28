package com.gxf.adapter;

/**
 * Created by 58 on 2017/12/28.
 * 适配器, 实现抽象接口
 */
public class AdapterRequest implements Request {
    private SpecialRequest specialRequest;

    public AdapterRequest(SpecialRequest specialRequest) {
        this.specialRequest = specialRequest;
    }

    public void request() {
        specialRequest.specialRequest();
    }

    public SpecialRequest getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(SpecialRequest specialRequest) {
        this.specialRequest = specialRequest;
    }
}
