package com.java8.pluralsightExample;

public class FixedCosts extends PolynomialQuantity {

    public FixedCosts(double constant){
        super(new double[] {constant});
    }

    @Override
    public String getName(){
        return "Fixed COsts";
    }
}
