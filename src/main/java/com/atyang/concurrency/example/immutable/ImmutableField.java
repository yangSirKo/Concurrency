package com.atyang.concurrency.example.immutable;

import com.atyang.concurrency.annotation.NotThreadSafe;
import com.google.common.collect.Maps;

import java.util.Map;

@NotThreadSafe
public class ImmutableField {

    private static final Integer a = 1;
    private static final Integer b = 2;
    private final static Map<Integer,Integer> map = Maps.newHashMap();

    static{
        map.put(1,11);
        map.put(2,22);
        map.put(3,33);
    }

    public static void main(String[] args) {

//        a = 3;
//        b = 4;
        System.out.println(map.put(1,111));
//        map = Maps.newHashMap();

    }


}
