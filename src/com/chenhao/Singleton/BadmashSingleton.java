package com.chenhao.Singleton;
//饿汉单例
public class BadmashSingleton {
    private static BadmashSingleton instance=new BadmashSingleton();
    private BadmashSingleton(){}
    public static  BadmashSingleton getInstance(){
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
}
