package com.factoryPlan;

public abstract class Plan {
    double rate;
    public abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
