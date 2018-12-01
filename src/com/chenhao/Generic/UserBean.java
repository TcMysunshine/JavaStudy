package com.chenhao.Generic;

public class UserBean implements Comparable<UserBean> {
    private String name;
    private Integer age;

    public UserBean(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserBean() {
    }
    public int compareTo(UserBean ub){
        if(this.age > ub.getAge()){
            return 1;
        }
        else if(this.age == ub.getAge()){
            return 0;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
