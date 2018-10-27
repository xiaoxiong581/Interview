package com.yzx.xiaoxiong581.designpatterns.modelmethod;

public class BmwCar extends AbstractCarModel {
    @Override
    protected void start() {
        System.out.println("bmwCar start");
    }

    @Override
    protected void stop() {
        System.out.println("bmwCar stop");
    }
}
