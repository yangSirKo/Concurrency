package com.atyang.concurrency.example.threadLocal;

public class RequestHolder {

    // thread 的 局部变量
    private static final ThreadLocal<Long> requestHolder= new ThreadLocal<>();

    public static long getId(){
        return requestHolder.get();
    }

    public static void setId(long val){
        requestHolder.set(val);
    }

    public static void remove(){
        requestHolder.remove();
    }

}
