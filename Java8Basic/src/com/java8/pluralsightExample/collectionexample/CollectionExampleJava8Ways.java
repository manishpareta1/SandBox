package com.java8.pluralsightExample.collectionexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * In this example we will use stream and its associated method to get the desired out put.
 * This will show case how we can achieve the same output using java 8 with less and more readable code.
 * we will see the extensive use of stream api and what we can achieve from it.
 */

public class CollectionExampleJava8Ways {
    final static String[] strings = new String[]{
            "Country Carrot",
            "Golden Banana",
            "Yellow Papaya",
            "Green Raw Mango",
            "",
            "Pineapple",
            " Kiwi"
    };


    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(strings);

        //using predicate which has one method test, it takes the input and calls test method to perform
        //the desired condition
        final Predicate<String> NON_EMPTY = string -> !string.isEmpty();

        final Function<String, Integer> lastIndex = (str) -> str.lastIndexOf(" ");
        final BiFunction<String, Integer, String> lastWord = (str, index) -> str.substring(index+1, str.length());

       System.out.println(stringList.stream()
                .filter(NON_EMPTY) //Filtering the stream for non empty string and passing it to map
                .map(phrase->{//its taking non empty string and returning last word of each string
                    final int index = lastIndex.apply(phrase);
                    if(index<0)
                        return phrase;
                    else{
                        return lastWord.apply(phrase, index);
                    }
                })//reduce is taking all the string returned from map one at a time, and appending it with first string
               //reduce works like sum += 1, takes 2 input, initial value, next value, then we can perform
               //desired operation on those values like below, concatenating them.
                .reduce((connectorStr, newString)-> connectorStr + " & " + newString)
                .orElse(""));

    }
}
