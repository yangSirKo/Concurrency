package com.atyang.concurrency.example.publish;

import com.atyang.concurrency.annotation.Recommend;
import com.atyang.concurrency.annotation.ThreadSafe;

/**
 * 通过 enum InnerClass 创建单例对象
 *
 * 枚举模式： 最安全。 既可以做到延时加载，又不会有锁竞争降低性能。
 */
@ThreadSafe
@Recommend
public class SingletonEnum {

    // 私有构造函数
    private SingletonEnum(){};

    public static SingletonEnum getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private SingletonEnum singleton ;

        // JVM 可以保证这个方法只被调用一次
        Singleton(){
            singleton = new SingletonEnum();
        }

        public SingletonEnum getInstance(){
            return singleton;
        }


    }


}
