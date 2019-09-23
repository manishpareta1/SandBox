package com.java8.pluralsightExample.codeduplicacyexample;

import java.util.Date;
import java.util.function.Supplier;

public class TimeCalculation {

    public static Double checkTime(String description, Supplier<Double> code) {

        final Date startTime = new Date();
        Double result = code.get();
        final Long totalTime = new Date().getTime() - startTime.getTime();
        System.out.println(description+" "+ totalTime+ " ms");
        return result;
    }

}
