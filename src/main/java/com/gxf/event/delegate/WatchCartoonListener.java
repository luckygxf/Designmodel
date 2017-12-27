package com.gxf.event.delegate;

import java.util.Date;

/**
 * Created by 58 on 2017/12/27.
 * 看漫画的同学
 */
public class WatchCartoonListener {
    public WatchCartoonListener(){
        System.out.println(this.getClass().getSimpleName() + " 我正在看漫画，开始时间： " + new Date());
    }

    public void stopWatchingCartoon(Date date){
        System.out.println(this.getClass().getSimpleName() + " 老师来了，不要看漫画了，结束时间： " + date);
    }
}
