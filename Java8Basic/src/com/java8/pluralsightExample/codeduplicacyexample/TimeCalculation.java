package com.java8.pluralsightExample.codeduplicacyexample;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TimeCalculation {


    /**
     *
     * @param description
     * @param code
     * @param <A>
     * @return A
     */
    public static <A> A checkTime(String description, Supplier<A> code){
        //empty implementation of consumer, so that we are not printing/logging information unnecessary.
        Consumer<String> defaultOutput = (s)->{};
        return checkTime(description, defaultOutput, code);
    }
    //Made this method a generic type.

    /**
     * This is an overloaded method, created to handle flexibility to perform additional operation of
     * console output.
     * With this overloaded method, we can pass consumer as parameter from those caller who wants to print/log
     * this information. and we will need to make changes to only those caller who want this log feature
     * this will help in reducing the efforts to make change in all the caller.
     * use of Consumer Functional Interface here is that it accepts the parameter but dosen't return anything
     * which is best suite for our console/log output statement, coz we just accept the input and print/log it
     * console.
     * @param description
     * @param output
     * @param code
     * @param <A>
     * @return A
     */
    public static <A> A checkTime(String description, Consumer<String> output, Supplier<A> code) {

        final Date startTime = new Date();
        A result = code.get();
        final Long totalTime = new Date().getTime() - startTime.getTime();
        output.accept(description+" "+ totalTime+ " ms");
        return result;
    }

}
