package com.learn.basic.use_static;

public class Dog {
    {
        System.out.println("这里是非静态代码块");
    }
    static {
        System.out.println("这里是静态代码块");
    }
    public Dog(){
        System.out.println("这里是构造函数");
    }
}
