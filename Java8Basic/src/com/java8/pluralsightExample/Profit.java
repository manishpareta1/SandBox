package com.java8.pluralsightExample;

public class Profit implements QuantityOfInterest {

    private Sales sales;
    private FixedCost fixedCost;
    private IncrementalCost incrementalCost;

    public Profit(Sales sales, FixedCost fixedCost, IncrementalCost incrementalCost){
        this.sales = sales;
        this.fixedCost = fixedCost;
        this.incrementalCost = incrementalCost;
    }

    public String getName(){
        return "Profit";
    }

    public double valueAt(int time){
        return sales.valueAt(time) -
                (incrementalCost.valueAt(time) +
                 fixedCost.valueAt(time));
    }


}
