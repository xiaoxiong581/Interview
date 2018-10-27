package com.yzx.xiaoxiong581.designpatterns.builder;

/**
 * @author xiaoxiong581
 * <p>
 * 建造者模式特点: 构造参数过多，不需要创建过多构造方法.
 */
public class Student
{
    private String name;

    private int age;

    private String address;

    public static class StudentBuilder
    {
        private String name = "xiaoxiong581";

        private int age = 20;

        private String address = "nanjing";

        public StudentBuilder setName(String name)
        {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age)
        {
            this.age = age;
            return this;
        }

        public StudentBuilder setAddress(String address)
        {
            this.address = address;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }
    }

    public Student(StudentBuilder studentBuilder)
    {
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.address = studentBuilder.address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
