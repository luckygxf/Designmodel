package com.gxf.responsibliity;

/**
 * Created by GuanXF on 2017/12/28.
 * 基类handler不能处理请求， 这里用抽象类，客户端就不能实例化
 */
public abstract class Handler {
    public Handler successorHandler;

    /**
     * 每个handler都应该处理方法
     * */
    public abstract void handler(int request);

    public Handler getSuccessorHandler() {
        return successorHandler;
    }

    public void setSuccessorHandler(Handler successorHandler) {
        this.successorHandler = successorHandler;
    }
}
