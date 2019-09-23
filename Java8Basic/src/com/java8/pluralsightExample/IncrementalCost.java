package com.java8.pluralsightExample;

public class IncrementalCost implements QuantityOfInterest {

    private final FunctionOvertime valueFunction;


    public IncrementalCost(FunctionOvertime valueFunction){
        this.valueFunction = valueFunction;
    }
    public String getName(){
        return "Incremental Cost";
    }

    public double valueAt(int time){
        return valueFunction.valutAt(time);
    }
}
