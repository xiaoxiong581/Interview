package com.yzx.xiaoxiong581.designpatterns;

import com.yzx.xiaoxiong581.designpatterns.singleton.Singleton;

/**
 * @author xiaoxiong581
 */
public class DesignPatternsMain {
    public static void main(String[] args) throws Exception
    {
        // 单例模式.
        Singleton.getInstance().doSomething();
    }
}
