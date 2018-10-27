package com.yzx.xiaoxiong581.designpatterns.modelmethod;

/**
 * @author xiaoxiong581
 *
 * 模板方法模式特点: 执行步骤确定，但是各个子步骤可以不同子类各自定制，父类无需改动.
 */
public abstract class AbstractCarModel {
    protected abstract void start();

    protected abstract  void stop();

    public final void execute() {
        start();
        stop();
    }
}
