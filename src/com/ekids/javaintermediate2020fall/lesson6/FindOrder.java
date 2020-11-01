package com.ekids.javaintermediate2020fall.lesson6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindOrder {
    public List<Order> findSupplyOrders(float minimumHelpAmount, List<Order> orders) {
        ArrayList<Order> supplyOrders = new ArrayList<>();
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order current = iterator.next();
            if(current.getAmount() >= minimumHelpAmount) {
                supplyOrders.add(current);
            }
        }

        return supplyOrders;
    }
}
