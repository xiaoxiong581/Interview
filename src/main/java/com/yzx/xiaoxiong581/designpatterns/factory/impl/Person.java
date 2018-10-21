package com.yzx.xiaoxiong581.designpatterns.factory.impl;

import com.yzx.xiaoxiong581.designpatterns.factory.Behavior;

/**
 * @author xiaoxiong581
 */
public class Person implements Behavior {
    @Override
    public void eat() {
        System.out.println("person eat");
    }

    @Override
    public void sleep() {
        System.out.println("person sleep");
    }
}
