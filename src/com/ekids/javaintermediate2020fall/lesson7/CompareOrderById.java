package com.ekids.javaintermediate2020fall.lesson7;

import java.util.Comparator;

public class CompareOrderById implements Comparator<Order> {
    /*
    * o1 > o2 -> любой положительное число
    * o1=o2 -> 0
    * o2 < o1 -> любое отриццательное число
    * */
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getOrderId() - o2.getOrderId();
    }

}
