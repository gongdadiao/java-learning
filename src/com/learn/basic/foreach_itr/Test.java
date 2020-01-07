package com.learn.basic.foreach_itr;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("jo瑟夫");
        list.add("jo鲁诺");
        list.add("jo助");
        /*
        for (String l : list) {
            if(l.equals("jo助"))
                list.remove(l);
        }*/
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String item = itr.next();
            if(item.equals("jo鲁诺"))
                itr.remove();
        }
        System.out.println("队列:"+list.toString());
    }
}
