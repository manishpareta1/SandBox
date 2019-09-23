package com.java8.pluralsightExample;

public class Sales implements QuantityOfInterest {

    private final FunctionOvertime valueFunction;


    public Sales(FunctionOvertime valueFunction){
        this.valueFunction = valueFunction;
    }
    public String getName(){
        return "Sales";
    }

    public double valueAt(int time){
        return valueFunction.valutAt(time);
    }
}
