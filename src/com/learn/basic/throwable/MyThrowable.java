package com.learn.basic.throwable;

public class MyThrowable extends Throwable {
    //返回异常发生时的简要描述
    @Override
    public String getMessage() {
        return "wait,这里可能出现了问题";
    }
    //返回异常发生时的详细信息
    @Override
    public String toString() {
        return "我的异常类";
    }
    //返回异常对象的本地化信息。
    // 使用Throwable的子类覆盖这个方法，可以生成本地化信息。
    // 如果子类没有覆盖该方法，则该方法返回的信息与getMessage（）
    // 返回的结果相同
    @Override
    public String getLocalizedMessage() {
        return this.getMessage();
    }
    //在控制台上打印Throwable对象封装的异常信息
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
