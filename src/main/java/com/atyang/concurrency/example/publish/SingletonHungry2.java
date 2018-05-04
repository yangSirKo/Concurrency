package com.atyang.concurrency.example.publish;

import com.atyang.concurrency.annotation.ThreadSafe;

/**
 * singleton pattern : 饿汉式
 * 单例实例在进行类装载时创建
 */
@ThreadSafe
public class SingletonHungry2 {

    // 私有化构造函数
    private SingletonHungry2(){}

    // 声明静态对象
    private static SingletonHungry2 instance = null;

    // 初始化instance对象。   注意：该初始化一定要放在声明实例之后，否则实例哪里会赋值null
    static{
        instance = new SingletonHungry2();
    }

    public static SingletonHungry2 getInstance(){
        return instance;
    }

    public static void main(String[] args) {

        System.out.println(getInstance());
        System.out.println(getInstance());

    }

}
