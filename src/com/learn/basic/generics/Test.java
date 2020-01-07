package com.learn.basic.generics;

public class Test {
    public static  <T extends Number & Comparable<? super T>> T  Min(T[] nums){
        T val=nums[0];
        for(int i=1;i<nums.length;i++){
            if(val.compareTo(nums[i])>0){
                val=nums[i];
            }
        }
        return val;
    }

    public static void main(String[] args) {
        Integer integer = Test.Min(new Integer[]{6, 2, 3, 9, 1, 3, 5});
        System.out.println("最小的数字为:"+integer);
    }
}
