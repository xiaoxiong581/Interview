package com.yzx.xiaoxiong581.proxy.statics;

import com.yzx.xiaoxiong581.proxy.common.Action;
import com.yzx.xiaoxiong581.proxy.common.RealHandler;

/**
 * @author xiaoxiong581
 */
public class StaticProxyHandler implements Action
{
    private RealHandler realHandler;

    public StaticProxyHandler(RealHandler realHandler)
    {
        this.realHandler = realHandler;
    }

    @Override
    public void doSomething()
    {
        System.out.println("static proxy handler");
        realHandler.doSomething();
    }
}