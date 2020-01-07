package com.learn.basic.collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        Arrays.sort(arr,1,3);
        System.out.println("arr排序1到3:"+Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("arr排序后:"+Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));
        System.out.println("4在位置:"+Arrays.binarySearch(arr,4));

        Integer arrls[]={8,7,6,5};
        List<Integer> list = Arrays.asList(arrls);
        System.out.println("使用asList后:"+list.getClass()+" -> "+list.toString());

    }
}
