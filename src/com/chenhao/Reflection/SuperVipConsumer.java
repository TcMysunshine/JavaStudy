package com.chenhao.Reflection;

public class SuperVipConsumer implements CustomerInterface{
    @Override
    public double discountPrice(double organticPrice){
        return organticPrice*0.5;
    }
}
