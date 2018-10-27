package com.yzx.xiaoxiong581.designpatterns.factorymethod;

/**
 * @author xiaoxiong581
 * <p>
 * 工厂方法特点: 方法全部是static属性，不需要实例化对象
 */
public class FactoryMethod
{
    private FactoryMethod()
    {
    }

    public static void doSomething()
    {
        System.out.println("Behavior Method do something");
    }
}
