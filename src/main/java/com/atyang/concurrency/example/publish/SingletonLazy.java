package com.atyang.concurrency.example.publish;

import com.atyang.concurrency.annotation.ThreadSafe;

/**
 * singleton pattern : 懒汉式
 * 单例实例在进行调用时创建
 *
 *
 */
@ThreadSafe
public class SingletonLazy {

    private SingletonLazy(){}

    // 单例对象    volatile + 双重检查机制 -> 禁止指令的重排序
    private volatile static SingletonLazy instance = null;

    // 双重检查机制
    public static SingletonLazy getInstance(){
        if(instance == null){
            synchronized (SingletonLazy.class){
                if(instance == null){
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

    /**

     对象初始化分三步：
     1. memory = allocate() 分配对象的内存空间。
     2. ctorInstance() 初始化对象。
     3. instance = memory  设置instance指向刚初始化的内存

     上述步骤在单线程模式下不会有问题。

     但是在多线程时如果发生重排序，将步骤2 和步骤3 进行重排序。
     此时对象并为初始化，其他线程判断到instance不会null，执行instance方法会发送空指针异常。
     */
}





