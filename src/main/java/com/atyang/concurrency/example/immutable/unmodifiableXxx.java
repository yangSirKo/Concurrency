package com.atyang.concurrency.example.immutable;

import com.atyang.concurrency.annotation.ThreadSafe;
import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.Map;

@ThreadSafe
public class unmodifiableXxx {

    private static Map<Integer,Integer> map = Maps.newHashMap();

    static {
        map.put(1, 11);
        map.put(2, 22);
        map.put(3, 33);
        // 将 map修改为不可变的 map
        map = Collections.unmodifiableMap(map);

    }

    public static void main(String[] args) {

//        System.out.println(map.put(1,111));  // throw "java.lang.UnsupportedOperationException"

    }


}
