package com.learn.basic.packing;

public class Test {
    public static void main(String[] args) {
        int x=3;
        int y=3;
        System.out.println("x==y:"+(x==y));

        Integer x1=new Integer(3);
        Integer y1=new Integer(3);
        System.out.println("x1==y1:"+(x1==y1));
        System.out.println("x1.equals(y1):"+(x1.equals(y1)));

    }
}
