package com.learn.basic.bigdecimal;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");
        BigDecimal x = a.subtract(b);
        BigDecimal y = b.subtract(c);
        System.out.println("两结果之间进行对比:"+x.equals(y));
        //保留几位小数n
        BigDecimal m = new BigDecimal("1.2223456");
        BigDecimal n = m.setScale(3, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(m+"保留三位:"+n);
    }
}
