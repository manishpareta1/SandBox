package com.java8.pluralsightExample;

public class ExampleProfitPrediction {

    final static double[] EXPECTED_SALES_JAN_TO_DEC=
            new double[]{42.0,45.6,43.6,50.2,55.6,54.7,58.0,57.3,
                    62.0,60.3,71.2,88.8};

    public static void main(String[] args) {
        //Sales class initialization
        //final FunctionOvertime sales = (time) ->EXPECTED_SALES_JAN_TO_DEC[time-1];
        //Changes for removing code duplicacy, objective here is to make code more precise and readable.
        //in general terms we are trying to move code expression to methods, so that the code becomes more flexible
        //and readable, with the use of Static and default methods of Functional Interface.
        //

        //#1 Code duplicacy
        final FunctionOvertime sales =
                FunctionOvertime.monthByMonth(EXPECTED_SALES_JAN_TO_DEC);
        //#2 Code duplicacy
        final FunctionOvertime fixedCost =
                FunctionOvertime.fixedCost(15.0);

       //#3 Code duplicacy
        final FunctionOvertime incrementalCost =
                FunctionOvertime.incrementalCost(5.0, 0.15);

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
