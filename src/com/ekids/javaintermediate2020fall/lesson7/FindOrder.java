package com.ekids.javaintermediate2020fall.lesson7;

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

    public Order findOrderWithMaxAmount(List<Order> orders) {
        Iterator<Order> iterator = orders.iterator();
        Order base = iterator.next();
        while (iterator.hasNext()) {
            Order current = iterator.next();
            if(current.getAmount() > base.getAmount()) {
                base = current;
            }
        }

        return base;
    }
}
