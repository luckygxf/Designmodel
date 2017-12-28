package com.gxf.responsibliity;

/**
 * Created by GuanXF on 2017/12/28.
 */
public class ConcretHandler3 extends Handler{

    /**
     * 处理any request
     * */
    public void handler(int request) {
        System.out.println(this.getClass().getSimpleName() + " handle request: " + request);
    }
}
