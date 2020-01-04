package com.learn.basic.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("开始序列:"+list);

        Collections.reverse(list);
        System.out.println("翻转后:"+list);

        Collections.shuffle(list);
        System.out.println("随机后:"+list);

        Collections.sort(list);
        System.out.println("排序后:"+list);

        Collections.swap(list,0,3);
        System.out.println("交换第1和3个后:"+list);

        //定制sort
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println("定制sort后:"+list);


    }
}
