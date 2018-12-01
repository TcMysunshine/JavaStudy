package com.chenhao.Reflection;
public class PropertiesConfig {

    //通过反射得到不同的对象
    public <T> T getBean(int type){
        StrategyEnum[] values = StrategyEnum.values();
        if(values != null && values.length > 0){
            for(StrategyEnum value : values){
                try {
                    if(type == value.getType()){
                        Class clazz = Class.forName(value.getClassName());
                        return (T) clazz.newInstance();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}

