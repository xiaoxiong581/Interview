package com.yzx.xiaoxiong581.proxy.common;

public class RealHandler implements Action {
    @Override
    public void doSomething() {
        System.out.println("real handler");
    }
}
