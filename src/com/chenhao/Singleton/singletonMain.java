package com.chenhao.Singleton;

import com.chenhao.Generic.UserBean;

import java.io.*;
//序列化，反序列化破坏了单例模式，但是可以修改
//单例模式为一个面向对象的应用程序提供了对象唯一的访问点，整个应用程序同享一个实例对象
public class singletonMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        e饿汉
//        BadmashSingleton s = BadmashSingleton.getInstance();
//        s.setName("chenhao");
//        s.getInfo();
//        BadmashSingleton s1 = BadmashSingleton.getInstance();
//        s1.setName("chenhao1");
//        s1.getInfo();
//        if(s==s1){
//            System.out.println("创建的是同一个实例");
//        }
//        else{
//            System.out.println("创建的不是同一个实例");
//        }
//        s.getInfo();
//        s1.getInfo();
//        懒汉
//        IdlerSingleton s = IdlerSingleton.getInstance();
//        s.setName("chenhao");
//        s.getInfo();
//        IdlerSingleton s1 = IdlerSingleton.getInstance();
//        s1.setName("chenhao1");
//        s1.getInfo();
//        if(s==s1){
//            System.out.println("创建的是同一个实例");
//        }
//        else{
//            System.out.println("创建的不是同一个实例");
//        }
//        s.getInfo();

//        UserBean rs = registerSingleton.getInstance("com.chenhao.Generic.UserBean");
//        rs.setName("chenhao");
//        rs.getInfo();

//        registerSingleton rs1 = registerSingleton.getInstance("com.chenhao.Singleton.registerSingleton");
//        rs1.setName("chenhao1");
//        rs1.getInfo();
//        if(rs==rs1){
//            System.out.println("创建的是同一个实例");
//        }
//        else{
//            System.out.println("创建的不是同一个实例");
//        }
//        rs.getInfo();
//        rs1.getInfo();

//        SingletonEnum s=SingletonEnum.INSTANCE;
//        s.setName("chenhao");
//        s.getInfo();
//
//        SingletonEnum s1=SingletonEnum.INSTANCE;
//        s1.setName("chenhao1");
//        s1.getInfo();
//
//        if(s==s1){
//            System.out.println("创建的是同一个实例");
//        }
//        else{
//            System.out.println("创建的不是同一个实例");
//        }
//        s.getInfo();
//        s1.getInfo();
        //反序列化得到的是一个新的对象实例
        ThreadSafeSingleton s = ThreadSafeSingleton.getInstance();
        s.setName("chenhao");
        s.getInfo();
//        write Object
        String filename = "tempFile";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeObject(ThreadSafeSingleton.getInstance());

//        read Object from file
        File file = new File(filename);
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream(file));
        ThreadSafeSingleton s1 =(ThreadSafeSingleton) ois.readObject();

        s1.setName("chenhao1");
        s1.getInfo();

        if (s == s1) {
            System.out.println("创建的是同一个实例");
        } else {
            System.out.println("创建的不是同一个实例");
        }
        s.getInfo();
        s1.getInfo();
    }

}
