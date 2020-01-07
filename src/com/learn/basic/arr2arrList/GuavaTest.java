package com.learn.basic.arr2arrList;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class GuavaTest {
    //对于不可变集合:ImmutableList of()&copyOf()方法
    //对于可变集合:Lists  newArrayList()工厂方法
    public static void main(String[] args) {
        String [] names={"jo斯达", "jo治", "jo瑟夫"};
        List<String> ls1 = ImmutableList.of("jo斯达", "jo治", "jo瑟夫");
        List<String> ls2 = ImmutableList.copyOf(names);

        List<String> ls3 = Lists.newArrayList(names);
        List<String> ls4 = Lists.newArrayList(ls1);

        System.out.println(ls1.getClass()+" "+ls1.toString());
        System.out.println(ls2.getClass()+" "+ls2.toString());
        System.out.println(ls3.getClass()+" "+ls3.toString());
        System.out.println(ls4.getClass()+" "+ls4.toString());
    }
}
