package com.java8.pluralsightExample;

abstract class MonthByMonthQuantity implements QuantityOfInterest{

    private final double[] values;

    protected MonthByMonthQuantity(final double[] values){
        this.values = values;
    }

    @Override
    public double valueAt(final int time){
        return values[time -1];
    }
}
