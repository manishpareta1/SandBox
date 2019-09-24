package com.java8.pluralsightExample.stream;

import java.util.Date;
import java.util.List;

public class Sales {

    private Store store;
    private List<Items> itemsList;
    private Date saleDate;
    private String name;

    public Sales(Store store, List<Items> itemsList, Date saleDate, String name) {
        this.store = store;
        this.itemsList = itemsList;
        this.saleDate = saleDate;
        this.name = name;
    }

    public double total() {
        //used lambda to get the sum or items associated with each sale
        return itemsList.stream().mapToDouble(item->item.getPrice()).sum();
    }
}
