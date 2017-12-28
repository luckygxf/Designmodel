package com.gxf.responsibliity;

/**
 * Created by GuanXF on 2017/12/28.
 */
public class ConcretHandler1 extends Handler{

    /**
     * 处理[1, 10]
     * */
    public void handler(int request) {
        if(request >= 0 && request <= 10){
            System.out.println(this.getClass().getSimpleName() + " handle request: " + request);
        }else if(getSuccessorHandler() != null){
            //交给后继者处理
            getSuccessorHandler().handler(request);
        }
    }
}
