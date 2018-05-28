package com.gupao.edu.pattern.singleton.hungry;

/**
 * 饿汉式单例模式
 * @createby: lichanghong on 2018-05-28 17:06
 **/
public class SingletonDemo2 {
    private static SingletonDemo2 singleton = new SingletonDemo2();

    private SingletonDemo2() {
    }

    public static SingletonDemo2 getInstance(){
        return singleton;
    }
}
