package com.java8.pluralsightExample;

public class Sales extends MonthByMonthQuantity {

    public Sales(double[] values){
        super(values);

    }

    @Override
    public String getName(){
        return "Expected Sales";
    }
}
