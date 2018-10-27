package com.yzx.xiaoxiong581.designpatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaoxiong581
 * <p>
 * 原型模式: 将一个对象作为原型，使用其clone方法创建一个实例.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PrototypePerson
{
    private String name;

    private int age;

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return new PrototypePerson(this.getName(), this.getAge());
    }
}
