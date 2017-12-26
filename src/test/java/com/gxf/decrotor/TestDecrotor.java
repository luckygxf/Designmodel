package com.gxf.decrotor;

import org.junit.Test;

/**
 * Created by 58 on 2017/12/26.
 */
public class TestDecrotor {

    @Test
    public void testDecrotor(){
        Person guanxianseng = new Person("guanxianseng");
        Sneakers pqx = new Sneakers();
        BigTrouser kk = new BigTrouser();
        TShirts dtx = new TShirts();

        pqx.decorate(guanxianseng);
        kk.decorate(pqx);
        dtx.decorate(kk);
        dtx.show();
    }

}
