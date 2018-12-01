package com.chenhao.Reflection;

import com.chenhao.Generic.UserBean;

import java.lang.reflect.Field;

public class test {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException,
            NoSuchFieldException{
        UserBean u = new UserBean();
        u.setName("chenhao");
        System.out.println(u.toString());
        Class c1 = UserBean.class;
        Class c2 = u.getClass();
        Class c3 = null;
        try{
//            动态加载类
            c3=Class.forName("com.chenhao.Generic.UserBean");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        try {
            UserBean u1 = (UserBean) c3.newInstance();
//            System.out.println(c1.getClassLoader());
            System.out.println(u1.toString());
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        System.out.println(c3.getMethods());
////
////        Class clazz = Class.forName("com.chenhao.Generic.UserBean");
////        Object obj = clazz.newInstance();
////// 调用getDeclaredField("name")方法取得name属性对应的Field对象，可以类获取私有属性
////        Field f = clazz.getDeclaredField("name");
////// 取消属性的访问权限控制，即使private属性也可以进行访问。
////        f.setAccessible(true);
////// 调用get()方法取得对应属性值。
////        System.out.println(f.get(obj));
////// 调用set()方法给对应属性赋值。
////        f.set(obj, "chenhao");
////// 调用get()方法取得对应属性修改后的值。
////        System.out.println(f.get(obj));

        int type = 1;

        PropertiesConfig pc = new PropertiesConfig();
        CustomerInterface customerInterface = pc.getBean(type);

        ExecuteStrategy excuteContext = new ExecuteStrategy(customerInterface);
        double price = excuteContext.execute(200.0);
        System.out.println("最终价格为：" + price);


    }

}
