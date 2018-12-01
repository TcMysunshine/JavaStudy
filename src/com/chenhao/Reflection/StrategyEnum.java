package com.chenhao.Reflection;

public enum StrategyEnum {
    VIPCONSUMER(1, "com.chenhao.Reflection.VipCustomer","VIP用户"),
    SUPERVIPCONSUMER(2, "com.chenhao.Reflection.SuperVipConsumer", "超级VIP用户");
    private int type;
    private String className;
    private String desc;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    StrategyEnum() {
    }

    StrategyEnum(int type, String className, String desc) {
        this.type = type;
        this.className = className;
        this.desc = desc;
    }
}
