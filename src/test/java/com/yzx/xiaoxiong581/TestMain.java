package com.yzx.xiaoxiong581;

import com.yzx.xiaoxiong581.proxy.common.RealHandler;

public class TestMain {
    public static void main(String[] args) throws Exception {
        RealHandler realHandler = (RealHandler) Class.forName("com.yzx.xiaoxiong581.proxy.common.RealHandler").newInstance();
        realHandler.doSomething();
    }
}
