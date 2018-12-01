package com.chenhao.Reflection;

public class VipCustomer implements CustomerInterface{
    @Override
    public double discountPrice(double organticPrice){
        return organticPrice*0.9;
    }
}
