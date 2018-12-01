package com.chenhao.Singleton;
//懒汉式单例类，只在需要时创建一个单例对象
public class IdlerSingleton {
    private static IdlerSingleton instance;
    private IdlerSingleton(){}
    public static IdlerSingleton getInstance(){
        if(instance==null){
            instance = new IdlerSingleton();
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
}
