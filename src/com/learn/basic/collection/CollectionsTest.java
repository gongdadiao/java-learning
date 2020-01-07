package com.learn.basic.collection;

import java.util.*;

public class CollectionsTest {
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


        System.out.println(list+" 二分查找3:"+Collections.binarySearch(list,3));

        System.out.println("最大元素:"+Collections.max(list));

        System.out.println("3出现次数:"+Collections.frequency(list,3));

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(2);
        System.out.println("3,2出现在哪里:"+Collections.indexOfSubList(list,list1));

        //Collection设置不可变集合
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(-1);
        arrList.add(2);
        arrList.add(2);
        arrList.add(5);
        arrList.add(1);
        arrList.add(5);

        System.out.println("不可变一元素list集合:"+Collections.singletonList(arrList));
        System.out.println("不可变一元素set集合:"+Collections.singleton(arrList));

        System.out.println("不可变list集合:"+Collections.unmodifiableList(arrList));

    }
}
