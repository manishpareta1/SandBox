package com.java8.pluralsightExample;

public interface QuantityOfInterest {

    String getName();

    /**
     * expected value for a particular month
     * @param time months, 1-12
     * @return expeted value
     */
    double valueAt(final int time);
}
