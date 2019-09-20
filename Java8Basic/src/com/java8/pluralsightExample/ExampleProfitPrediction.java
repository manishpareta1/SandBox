package com.java8.pluralsightExample;

public class ExampleProfitPrediction {

    final static double[] EXPECTED_SALES_JAN_TO_DEC=
            new double[]{42.0,45.6,43.6,50.2,55.6,54.7,58.0,57.3,
                    62.0,60.3,71.2,88.8};

    public static void main(String[] args) {
        //Sales class initialization
        final Sales sales = new Sales(EXPECTED_SALES_JAN_TO_DEC);

        //FixedClass initialization
        final FixedCosts fixedCost = new FixedCosts(15.0);


        //Incremental Cost initialization
        final IncrementalCosts incrementalCost = new IncrementalCosts(5.1,0.15);

        //Profit Class Initialization
        final Profit profitf = new Profit(sales, incrementalCost, fixedCost);

        double total = 0.0;
        for(int i=1;i<=12;i++){
            total += profitf.valueAt(i);
        }

        System.out.println("Total profit for the year is: "+total);
    }

}
