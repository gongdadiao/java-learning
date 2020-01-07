package com.learn.basic.datastructure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;

public class MyStack<T extends Number & Comparable<? super T>> {
    private T[] storage;
    private int count =0;
    private int capcity=5;
    private final static int GROW_FACTOR=2;

    public MyStack(Class<T> type){
        storage = (T[])Array.newInstance(type,this.capcity);
    }

    private void ensureCapcity(){
        int newCapcity=this.capcity*GROW_FACTOR;
        this.storage= Arrays.copyOf(this.storage,newCapcity);
        this.capcity=newCapcity;
    }
    Boolean push(T item){
        if(this.count >= storage.length)
            this.ensureCapcity();
        storage[this.count++]=item;
        return true;
    }
    T pop(){
        if(this.size()<=0)
            throw new IllegalArgumentException("Stack empty");
        this.count--;
        return storage[this.count];
    }
    T peek(){
        if(this.size()<=0)
            throw new IllegalArgumentException("stack empty");
        return storage[this.count -1];
    }
    Boolean isEmpty(){
        return this.count==0;
    }
    int size(){
        return this.count;
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(Integer.class);
        stack.push(new Integer(3));
        stack.push(new Integer(2));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
