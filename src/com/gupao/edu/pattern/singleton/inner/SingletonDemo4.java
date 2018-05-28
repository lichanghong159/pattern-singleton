package com.gupao.edu.pattern.singleton.inner;

/**
 * 静态内部类
 * @createby: lichanghong on 2018-05-28 17:16
 **/
public class SingletonDemo4 {
    private SingletonDemo4(){}

    private static class SingletonDemo4Inner{
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }
    public static final SingletonDemo4 getInstance(){
        return SingletonDemo4Inner.instance;
    }

}
