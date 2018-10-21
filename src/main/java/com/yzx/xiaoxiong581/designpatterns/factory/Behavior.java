package com.yzx.xiaoxiong581.designpatterns.factory;

/**
 * @author xiaoxiong581
 *
 * 抽象工厂特点: 定义一个公共接口类，每新增一种产品新增一个实现类
 */
public interface Behavior {
    void eat();

    void sleep();
}
