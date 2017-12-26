package com.gxf.event.delegate;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by 58 on 2017/12/26.
 */
public class GoodNotifier extends Notifier {
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的同学委托尽职尽责的放哨人!");
        EventHandler handler = this.getEventHandler();
        handler.addEvent(object, methodName, args);
    }

    public void notifyX() {
        System.out.println("尽职尽责的放哨人告诉所有需要帮忙的同学：老师来了");
        try {
            this.getEventHandler().notifyX();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
