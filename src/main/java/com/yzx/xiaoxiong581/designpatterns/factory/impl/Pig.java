package com.yzx.xiaoxiong581.designpatterns.factory.impl;

import com.yzx.xiaoxiong581.designpatterns.factory.Behavior;

/**
 * @author xiaoxiong581
 */
public class Pig implements Behavior {
    @Override
    public void eat() {
        System.out.println("pig eat");
    }

    @Override
    public void sleep() {
        System.out.println("pig sleep");
    }
}
