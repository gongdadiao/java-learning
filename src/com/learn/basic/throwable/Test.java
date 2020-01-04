package com.learn.basic.throwable;

public class Test {
    public static void main(String[] args) {
        try{
            throw new MyThrowable();
        }catch (MyThrowable myThrowable){
            myThrowable.printStackTrace();
            System.out.println("-----------------------");
            System.out.println(myThrowable.getMessage());
            System.out.println(myThrowable.toString());
            return;
        }
        finally {
            System.out.println("你必须执行我finally不可");
        }
    }
}
