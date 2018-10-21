package com.yzx.xiaoxiong581.designpatterns;

import com.yzx.xiaoxiong581.designpatterns.builder.Student;
import com.yzx.xiaoxiong581.designpatterns.factory.Behavior;
import com.yzx.xiaoxiong581.designpatterns.factory.impl.Person;
import com.yzx.xiaoxiong581.designpatterns.factory.impl.Pig;
import com.yzx.xiaoxiong581.designpatterns.factorymethod.FactoryMethod;
import com.yzx.xiaoxiong581.designpatterns.singleton.Singleton;

/**
 * @author xiaoxiong581
 */
public class DesignPatternsMain {
    public static void main(String[] args) throws Exception {
        // 单例模式.
        System.out.println("****************单例模式 begin****************");
        Singleton.getInstance().doSomething();
        System.out.println("****************单例模式 begin****************");

        // 工厂方法.
        System.out.println("****************工厂方法 begin****************");
        FactoryMethod.doSomething();
        System.out.println("****************工厂方法 begin****************");

        // 工厂模式.
        System.out.println("****************工厂模式 begin****************");
        Behavior person = new Person();
        person.eat();
        person.sleep();

        Behavior pig = new Pig();
        pig.eat();
        pig.sleep();
        System.out.println("****************工厂模式 end****************");

        // 建造者模式.
        System.out.println("****************建造者模式 begin****************");
        System.out.println(new Student.StudentBuilder().setAge(26).build());
        System.out.println("****************建造者模式 begin****************");
    }
}
