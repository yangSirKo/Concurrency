package com.atyang.concurrency.example.publish;

import com.atyang.concurrency.annotation.ThreadSafe;


/**
 * singleton pattern : 饿汉式
 * 单例实例在进行类装载时创建
 */
@ThreadSafe
public class SingletonHungry {

    private SingletonHungry(){}

    private static SingletonHungry instance = new SingletonHungry();

    public static SingletonHungry getInstance(){
        return instance;
    }

}
