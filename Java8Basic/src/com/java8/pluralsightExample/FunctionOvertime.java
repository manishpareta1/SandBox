package com.java8.pluralsightExample;



@FunctionalInterface
interface FunctionOvertime {

    public double valutAt(int time);

    static FunctionOvertime monthByMonth(final double[] values){
        return (time)-> values[time-1];
    }

    static FunctionOvertime fixedCost(final double value){
        //return (time) -> value;
        return FunctionOvertime.polynomial(new double[]{value});
    }

    static FunctionOvertime incrementalCost(final double intercept, final double slop){
        //return (time) -> intercept + slop*time;
        return FunctionOvertime.polynomial(new double[]{intercept,slop});
    }

    //adding polynomial function to make fixed cost and incremental cost use a more generic way of implementation
    static FunctionOvertime polynomial(final double[] values){
        return (time) ->{
            Double sum = 0.0;
            for(int i=0; i<values.length;i++){
                sum += Math.pow(time, i)*values[i];
            }
            return sum;
        };
    }
}
