package com.java8.pluralsightExample;

public class FixedCost implements QuantityOfInterest {

    private final FunctionOvertime valueFunction;


    public FixedCost(FunctionOvertime valueFunction){
        this.valueFunction = valueFunction;
    }
    public String getName(){
        return "Fixed Cost";
    }

    public double valueAt(int time){
        return valueFunction.valutAt(time);
    }
}
