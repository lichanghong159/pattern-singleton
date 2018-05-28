package com.gupao.edu.pattern.singleton.doubleCheck;

/**
 * 双重检查
 * @createby: lichanghong on 2018-05-28 17:08
 **/
public class SingletonDemo {
    private static SingletonDemo singleton;
    private SingletonDemo(){

    }
    public static SingletonDemo getInstance(){
        if(singleton==null){
        synchronized (SingletonDemo.class){
                    if(singleton==null){
                        singleton = new SingletonDemo();
                }
            }
        }
        return singleton;
    }
}
