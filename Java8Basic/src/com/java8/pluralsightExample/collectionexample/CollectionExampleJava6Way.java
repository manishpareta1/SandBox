package com.java8.pluralsightExample.collectionexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Objective of this example to get the last word of the given string array and create a new string
 * by using & as separator.
 * Java 6 way of doing it uses External iteration on the list/array of element.
 * @input - ["Country Carrot", "Golden Banana" ,"","Yellow Papaya"]
 * @Output - "Carrot & Banana & Papaya"
 */
public class CollectionExampleJava6Way {

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

        System.out.println(summary(strings));
    }

    private static String summary(String[] strings) {
        StringBuilder output = new StringBuilder();
        boolean isFirst = true;
        int count = 0;
        int isLast = 0;
        List<String> validList = getNonEmptyList(strings);
        if (validList.size() == 0) {
            return "";
        } else {
            for (String s : strings) {
                final String word = lastWord(s);
                if (!(count++ == strings.length-1)) {
                    if (!word.isEmpty()) {
                        output.append(word);
                        output.append(" & ");
                    }
                }else{
                    output.append(word);
                }
            }
        }
        return output.toString();
    }

    private static String lastWord(String string){
        final int index = string.lastIndexOf(" ");
        if(index<0)
            return string;
        else{
            return string.substring(index+1, string.length());
        }
    }

    private static List<String> getNonEmptyList(String[] strings){

        List<String> nonEmptyList = new ArrayList<String>();
        for(String s : strings){
            if(!s.isEmpty()){
                nonEmptyList.add(s);
            }
        }
        return nonEmptyList;

    }

}
