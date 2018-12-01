package com.chenhao.Singleton;

public enum SingletonEnum {
    INSTANCE;
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
