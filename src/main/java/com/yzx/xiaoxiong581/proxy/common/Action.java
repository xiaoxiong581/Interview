package com.yzx.xiaoxiong581.proxy.common;

public interface Action {
    void doSomething();

    default void doAnotherthing() {
        System.out.println("do Anotherthing");
    }
}
