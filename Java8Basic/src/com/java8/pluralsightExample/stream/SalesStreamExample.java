package com.java8.pluralsightExample.stream;


import java.util.Arrays;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class SalesStreamExample {

    static List<Sales> salesList =
            Arrays.asList(
                    new Sales(Store.SARJAPUR,
                            Arrays.asList(new Items("Banana", 35)),
                            new Date(), "Suresh"),
                    new Sales(Store.SARJAPUR,
                                Arrays.asList(new Items("Sapota", 40),
                                              new Items("Papaya", 25)),
                                new Date(), "Ramesh"),
                    new Sales(Store.SARJAPUR,
                            Arrays.asList(new Items("Potato", 25),
                                          new Items("Onion", 48),
                                          new Items("Chilli", 40)),
                            new Date(), "Ganesh")
            );

    public static Stream<Sales> salesStream(){
        return salesList.stream();
    }


    public static void main(String[] args) {

        //Count how many sales are done
       System.out.println("How many sales? "+salesStream().count());

       //find store where sale done is more than Rs 100
        //anymatch is a short circuiting operation, where it stops the stream processing as soon as it
        //matches the condition.
        System.out.println("Big Sale Day? "+salesStream().anyMatch(sale->sale.total()>100));

        //Maximum sale amount? using Double Summary sta class
        DoubleSummaryStatistics statistics =
                salesStream().mapToDouble(sale->sale.total()).summaryStatistics();

        System.out.println("Max Sale amount?"+ statistics.getMax());
        System.out.println("Printing Stats: "+ statistics);

    }
}
