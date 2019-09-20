package com.java8.pluralsightExample;

public class Profit implements QuantityOfInterest {

    private final Sales sales;
    private final IncrementalCosts incrementalCosts;
    private final FixedCosts fixedCosts;

    public Profit(Sales sales,
                  IncrementalCosts incrementalCosts,
                  FixedCosts fixedCosts) {
        this.sales = sales;
        this.incrementalCosts = incrementalCosts;
        this.fixedCosts = fixedCosts;
    }

    @Override
    public String getName(){
        return "Profits!!";
    }

    @Override
    public double valueAt(final int time){
        return sales.valueAt(time) -
                (incrementalCosts.valueAt(time)+
                        fixedCosts.valueAt(time));
    }
}
