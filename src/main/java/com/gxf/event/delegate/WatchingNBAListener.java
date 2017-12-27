package com.gxf.event.delegate;

import java.util.Date;

/**
 * Created by 58 on 2017/12/27.
 * 看NBA的同学
 */
public class WatchingNBAListener {
    public WatchingNBAListener() {
        System.out.println("我正在看NBA， 开始时间： " + new Date());
    }
    public void stopWatchingNBA(Date date){
        System.out.println(this.getClass().getSimpleName() + " 老师来了，不要在看nba了， 结束时间是：" + date);
    }
}
