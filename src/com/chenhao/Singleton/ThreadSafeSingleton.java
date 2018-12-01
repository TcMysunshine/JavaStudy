package com.chenhao.Singleton;

import java.io.Serializable;

//双重校验
public class ThreadSafeSingleton implements Serializable {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}
    public static ThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance ==null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void getInfo(){
        System.out.println("类中的名字是" + this.name);
    }
    public Object readResolve(){
        return instance;
    }

}
