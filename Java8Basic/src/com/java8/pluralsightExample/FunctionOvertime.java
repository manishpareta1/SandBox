package com.java8.pluralsightExample;



@FunctionalInterface
interface FunctionOvertime {

    public double valutAt(int time);

    static FunctionOvertime monthByMonth(final double[] values){
        return (time)-> values[time-1];
    }

    static FunctionOvertime fixedCost(final double value){
        return (time) -> value;
    }

    static FunctionOvertime incrementalCost(final double intercept, final double slop){
        return (time) -> intercept + slop*time;
    }
}
