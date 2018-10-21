package com.yzx.xiaoxiong581.proxy;

import com.yzx.xiaoxiong581.proxy.common.Action;
import com.yzx.xiaoxiong581.proxy.common.RealHandler;
import com.yzx.xiaoxiong581.proxy.dynamic.DynamicProxyHandler;
import com.yzx.xiaoxiong581.proxy.statics.StaticProxyHandler;

import java.lang.reflect.Proxy;

/**
 * @author xiaoxiong581
 */
public class ProxyMain {
    public static void main(String[] args) {
        // 静态实现.
        StaticProxyHandler staticProxyHandler = new StaticProxyHandler(new RealHandler());
        staticProxyHandler.doSomething();

        // 动态实现.
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(new RealHandler());
        Action proxy = (Action) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Action.class}, dynamicProxyHandler);
        proxy.doSomething();
    }
}
