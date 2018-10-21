package com.yzx.xiaoxiong581.designpatterns.singleton;

/**
 * @author xiaoxiong581
 */
public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance()
    {
        if (null == instance)
        {
            synchronized (Singleton.class)
            {
                if (null == instance)
                {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public void doSomething()
    {
        System.out.println("Singleton do something");
    }
}