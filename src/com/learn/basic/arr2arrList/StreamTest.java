package com.learn.basic.arr2arrList;

import com.sun.jmx.remote.util.ClassLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    //java8新特性
    public static void main(String[] args) {
        String names[]={"jo鲁诺","jo太郎","jo瑟夫","jo助"};
        List<String> list = Arrays.stream(names).collect(Collectors.toList());
       System.out.println("对象数组转化后:"+ list.getClass()+" ->" +list.toString());
        //依赖boxed装箱操作，基本类型可以转换
        int [] nums={2,3,4,5,6};
        List<Integer> list1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println("基本类型数组转化后:"+list1.getClass()+" ->"+list1.toString());
    }
}
