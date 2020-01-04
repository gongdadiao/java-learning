package com.learn.basic.hashcode_equals;

public class Test {
    public static void main(String[] args) {
        String s = new String("nihao");
        String s1=new String("nihao");
        System.out.println("s:"+s);
        System.out.println("s1:"+s1);
        System.out.println("s.equals(s1):"+(s.equals(s1)));
        System.out.println("s.hashcode:"+s.hashCode());
        System.out.println("s1.hashcode:"+s1.hashCode());

    }
}
