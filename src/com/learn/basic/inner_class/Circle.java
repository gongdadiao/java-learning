package com.learn.basic.inner_class;

public class Circle {
    double radius=0;
    public Circle(double radius){
        this.radius=radius;
    }
    public void setThing(DoSomething ds){
        System.out.println("匿名内部类应用结果："+ds.getThing());
    }

    static class Draw{
        public void DrawShape(){
            System.out.println("draw");
        }
    }

    class Made{
        //内部类
        //可以无条件访问外部类的所有成员属性和成员方法
        public void madeShape(){
            System.out.println(Circle.this.radius);
        }
    }
}
