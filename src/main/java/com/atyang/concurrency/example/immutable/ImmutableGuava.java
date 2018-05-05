package com.atyang.concurrency.example.immutable;

import com.atyang.concurrency.annotation.ThreadSafe;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.List;

@ThreadSafe
public class ImmutableGuava {

    private final static List<Integer> list = ImmutableList.of(1,2,3,4);
    private final static ImmutableList<Integer> list2 = ImmutableList.of(1,2,3,4);
//  上面两个方法作用一样，但是使用 ImmutableList时，向集合里添加元素会提示方法过期，而List不提示

    private final static ImmutableSet<Integer> set = ImmutableSet.copyOf(list);

    private final static ImmutableMap<Integer,Integer> map = ImmutableMap.of(1,11,2,22);
    private final static ImmutableMap<Integer,Integer> map2 = ImmutableMap.<Integer,Integer>builder()
            .put(1,11).put(2,22).put(3,33).build();



    public static void main(String[] args) {

        // down all option will throw "java.lang.UnsupportedOperationException"
//        list.add(5);  // List
//        list2.add(5); // ImmutableList
//        set.add(5);
//        map.put(3,33);
//        map2.put(4,44);


    }

}
