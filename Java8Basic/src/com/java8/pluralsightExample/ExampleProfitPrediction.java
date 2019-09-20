package com.java8.pluralsightExample;

public class ExampleProfitPrediction {

    final static double[] EXPECTED_SALES_JAN_TO_DEC=
            new double[]{42.0,45.6,43.6,50.2,55.6,54.7,58.0,57.3,
                    62.0,60.3,71.2,88.8};

    public static void main(String[] args) {
        //Sales class initialization
        final FunctionOvertime sales = (time) ->EXPECTED_SALES_JAN_TO_DEC[time-1];

        //FixedClass initialization
        final FunctionOvertime fixedCost = (time) -> 0.15;

        //Incremental Cost initialization
        final FunctionOvertime incrementalCost =
                (time) -> 5.1 + 0.15*time;

        //Profit Class Initialization
        final FunctionOvertime profit =
                (time) -> sales.valutAt(time)-
                        (incrementalCost.valutAt(time) +
                                fixedCost.valutAt(time));

        double total = 0.0;
        for(int i=1;i<=12;i++){
            total += profit.valutAt(i);
        }

        System.out.println("Total profit for the year is: "+total);
    }

}
