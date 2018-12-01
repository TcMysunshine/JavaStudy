package com.chenhao.Singleton;


import java.util.HashMap;
import java.util.Map;

public class registerSingleton {
    private static Map<String, registerSingleton> map = new HashMap<>();

    static {
        registerSingleton instance = new registerSingleton();
        map.put(instance.getClass().getName(), instance);
    }

    protected registerSingleton() {
    }

    public static registerSingleton getInstance(String name) {
        if (name == null) {
            name = registerSingleton.class.getName();
            System.out.println("name == null" + "--->name=" + name);
        }
        if (map.get(name) == null) {
            try {
                map.put(name, (registerSingleton) Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
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
