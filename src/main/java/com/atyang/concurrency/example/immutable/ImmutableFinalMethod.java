package com.atyang.concurrency.example.immutable;


class superClass {

    private int num = 1;
    private int num2 = 2;

    public final int getNum() {
        return num;
    }

    // private method default additional final keyword
    private int getNumber(){
        return num2;
    }
}

public class ImmutableFinalMethod extends superClass{

    /**
        覆盖 final方法会报错
        public int getNum(){
            return num;
        }
    */

}


