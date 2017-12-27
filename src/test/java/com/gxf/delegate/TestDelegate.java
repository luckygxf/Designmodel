package com.gxf.delegate;

import com.gxf.event.delegate.GoodNotifier;
import com.gxf.event.delegate.Notifier;
import com.gxf.event.delegate.WatchCartoonListener;
import com.gxf.event.delegate.WatchingNBAListener;
import org.junit.Test;

import java.util.Date;

/**
 * Created by 58 on 2017/12/27.
 * 测试时间代理
 */
public class TestDelegate {

    @Test
    public void test(){
        Notifier goodNotifier = new GoodNotifier();

        WatchCartoonListener watchCartoonListener = new WatchCartoonListener();
        WatchingNBAListener watchingNBAListener = new WatchingNBAListener();

        goodNotifier.addListener(watchCartoonListener, "stopWatchingCartoon", new Date());
        goodNotifier.addListener(watchingNBAListener, "stopWatchingNBA", new Date());

        try {
            Thread.sleep(1000);
            goodNotifier.notifyX();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
