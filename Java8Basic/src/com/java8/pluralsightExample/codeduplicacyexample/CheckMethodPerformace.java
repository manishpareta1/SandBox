package com.java8.pluralsightExample.codeduplicacyexample;

import java.util.Date;

/**
 * This is an example of reducing code duplicacy using function programing.
 * This example is performing three operations calculateCost, Calculate Revenue and Calculate Profit for a Company
 * The proble with these operations is their performance.
 * Objective is to find and fix the performance issue with these operations.
 * to start with we are going to use Data Api to check the execution time of each method by calculation
 * before and after execution time of each method.
 * Then we will try to improvise the same solution using Functional Interface.
 */

public class CheckMethodPerformace {

    static int max = 5000;
    static int min = 1000;
    static int range = max - min + 1;

    public static void main(String[] args) {

        /*final Date costTime = new Date();
         final Double cost = calculateCost();
         final Long totalCostTime = new Date().getTime() - costTime.getTime();
         System.out.println("Time taken for cost calculation: "+ totalCostTime);*/
        //Refactored Cost calculation using Functional interface and separating duplicate code.
        Double costResult =
                TimeCalculation.checkTime("Time taken for Cost calculation: ", CheckMethodPerformace::calculateCost);

        /*final Date revenueTime = new Date();
         final Double revenue = calculateRevenue();
         final Long totalRevenueTime = new Date().getTime() - revenueTime.getTime();
         System.out.println("Time taken for cost calculation: "+ totalRevenueTime);*/
        //Refactored Revenue calculation using Functional interface and separating duplicate code.
        Double revenueResult =
                TimeCalculation.checkTime("Time taken for Revenue calculation: ", CheckMethodPerformace::calculateRevenue);

       /* final Date profitTime = new Date();
         final Double profit = calculateProfit(cost, revenue);
         final Long totalProfitTime = new Date().getTime() - profitTime.getTime();
         System.out.println("Time taken for cost calculation: "+ totalProfitTime);*/
        //Refactored Profit calculation using Functional interface and separating duplicate code.
        //using overloaded method, compared to cost and revenue.
        Double profitResult =
                TimeCalculation.checkTime("Time taken for Profit calculation: ",
                        System.out::println,()->calculateProfit(costResult, revenueResult));

        System.out.println("Total Profit is: "+profitResult);
    }

    private static Double calculateCost() {
        try {
            Thread.sleep((long)(Math.random()*range)+min);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 2323.1;
    }

    private static Double calculateRevenue() {
        try {
            Thread.sleep((long)(Math.random()*range)+min);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 5342.9;
    }

    private static Double calculateProfit(double cost, double revenue) {
        try {
            Thread.sleep((long)(Math.random()*range)+min);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return revenue - cost;
    }


}
