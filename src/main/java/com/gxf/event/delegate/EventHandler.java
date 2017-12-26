package com.gxf.event.delegate;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 58 on 2017/12/26.
 * 事件的处理者
 */
public class EventHandler {
    private List<Event> objects;

    public EventHandler() {
        this.objects = new ArrayList<Event>();
    }

    //添加某个对象要执行的事件， 以及需要的参数
    public void addEvent(Object object, String methodName, Object... args){
        objects.add(new Event(object, methodName, args));
    }

    //通知所有的对象执行指定的事件
    public void notifyX() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for(Event e : objects){
            e.invoke();
        }
    }

}
