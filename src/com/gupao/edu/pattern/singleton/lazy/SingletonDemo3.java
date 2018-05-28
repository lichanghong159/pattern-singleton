package com.gupao.edu.pattern.singleton.lazy;

/**
 * 懒加载
 * @createby: lichanghong on 2018-05-28 17:12
 **/
public class SingletonDemo3 {
    private static SingletonDemo3 instance;
    private SingletonDemo3(){}
    private static SingletonDemo3 getInstance(){
        if(instance==null){
            return new SingletonDemo3();
        }
        return instance;
    }
}
