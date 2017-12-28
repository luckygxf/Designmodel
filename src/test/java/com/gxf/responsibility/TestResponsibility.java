package com.gxf.responsibility;

import com.gxf.responsibliity.ConcretHandler1;
import com.gxf.responsibliity.ConcretHandler2;
import com.gxf.responsibliity.ConcretHandler3;
import com.gxf.responsibliity.Handler;
import org.junit.Test;

/**
 * Created by GuanXF on 2017/12/28.
 */
public class TestResponsibility {

    /**
     * 测试职责链
     * */
    @Test
    public void test(){
        int[] requests = {3, 40, 69, 3, 3, 2, 59, 20, 18, 19, 23};
        Handler handler1 = new ConcretHandler1();
        Handler handler2 = new ConcretHandler2();
        Handler handler3 = new ConcretHandler3();

        handler1.setSuccessorHandler(handler2);
        handler2.setSuccessorHandler(handler3);

        for(int i = 0; i < requests.length; i++){
             handler1.handler(requests[i]);
        }
    }
}
