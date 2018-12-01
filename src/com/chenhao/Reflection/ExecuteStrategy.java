package com.chenhao.Reflection;

public class ExecuteStrategy {
    private CustomerInterface customerInterface;
    public ExecuteStrategy(CustomerInterface customerInterface){
        this.customerInterface=customerInterface;
    }
    public double execute(Double money){
        return customerInterface.discountPrice(money);
    }
}
