package com.chenhao.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparableTest {
    public static void main(String[] args) {
        UserBean u1 = new UserBean("che1",67);
        UserBean u2 = new UserBean("che2",90);
        UserBean u3 = new UserBean("che3",67);
        UserBean u4 = new UserBean("che4",23);
        ArrayList<UserBean> userBeans = new ArrayList<>();
        userBeans.add(u1);
        userBeans.add(u2);
        userBeans.add(u3);
        userBeans.add(u4);
//        Collections.sort(userBeans);
//        for(UserBean u:userBeans){
//            System.out.println(u.getName()+":"+u.getAge().toString());
//        }
        Collections.sort(userBeans, new UserDescAgeCompator());
        for(UserBean u:userBeans){
            System.out.println(u.getName()+":"+u.getAge().toString());
        }

    }
    private static class UserDescAgeCompator implements Comparator<UserBean> {
        public int compare(UserBean ub1, UserBean ub2){
            return ub2.getAge() - ub1.getAge();
        }
    }
}
