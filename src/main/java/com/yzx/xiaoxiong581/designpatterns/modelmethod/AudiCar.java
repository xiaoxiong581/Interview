package com.yzx.xiaoxiong581.designpatterns.modelmethod;

public class AudiCar extends AbstractCarModel {
    @Override
    protected void start() {
        System.out.println("audiCar start");
    }

    @Override
    protected void stop() {
        System.out.println("audiCar stop");
    }
}
