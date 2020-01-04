package com.learn.basic.equal_equals;

public class Test {
    public static void main(String[] args) {
        String s = new String("nihao");
        String s1 = new String("nihao");
        System.out.println("s==s1:"+(s==s1));
        System.out.println("s.equals(s1):"+(s.equals(s1)));

        String aa="ab";
        String bb="ab";
        System.out.println("aa==bb:"+(aa==bb));
        System.out.println("aa.equals(bb):"+(aa.equals(bb)));

    }
}
