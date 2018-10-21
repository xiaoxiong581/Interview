package com.yzx.xiaoxiong581.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
    private Object realHandler;

    public DynamicProxyHandler(Object realHandler) {
        this.realHandler = realHandler;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dynamic proxy handler");
        return method.invoke(realHandler, args);
    }
}
