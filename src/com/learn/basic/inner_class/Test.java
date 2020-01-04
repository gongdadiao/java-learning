package com.learn.basic.inner_class;

public class Test {

    public static void main(String[] args) {
        //静态内部类
        Circle.Draw draw = new Circle.Draw();
        //非静态内部类
        Circle circle = new Circle(1);
        Circle.Made made = circle.new Made();

        circle.setThing(new DoSomething() {
            @Override
            public String getThing() {
                return "the thing";
            }
        });

    }
}
