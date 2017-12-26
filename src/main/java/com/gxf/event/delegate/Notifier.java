package com.gxf.event.delegate;

/**
 * Created by 58 on 2017/12/26.
 */
public abstract class Notifier {

    private EventHandler eventHandler = new EventHandler();

    /**
     * 增加需要帮忙 放哨的学生
     * @param object
     * @param methodName 执行方法的方法名
     * @param args 执行方法的参数
     * */
    public abstract void addListener(Object object, String methodName, Object... args);

    /**
     * 告诉所有要帮忙放哨的学生：老师来了
     * */
    public abstract void notifyX();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }
}
