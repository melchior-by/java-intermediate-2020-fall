package com.ekids.javaintermediate2020fall.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//ДЗ - добавить метод в FindOrder - Order c максимальным колличеством, минимальным колличеством и т.д.

public class Main {

    public static void main(String[] args) {
        //List -> ArrayList, LinkedList
        //Set -> HashSet - структура данных для хранения уникальных элементов
        HashSet<String> footballTeamNames = new HashSet<>();
        footballTeamNames.add("Барселона");
        footballTeamNames.add("Реал Мадрид");
        footballTeamNames.add("Динамо Киев");
        footballTeamNames.add("Динамо Киев");
        System.out.println(footballTeamNames.size());

        System.out.println("****************************");
        List<Order> orders = new ArrayList<Order>() {
            {
                add(new Order(1, 10.1f));
                add(new Order(2, 12.5f));
                add(new Order(3, 8.99f));
            }
        };
        System.out.println(Arrays.asList(orders));

        FindOrder findOrder = new FindOrder();
        List<Order> suppliedOrders = findOrder.findSupplyOrders(10.0f, orders);
        System.out.println("We supply orders: " + suppliedOrders);
        //зачем нужны стримы
        System.out.println("We supply order numbers: " + suppliedOrders.stream().map(Order::getOrderId).collect(Collectors.toList()));

    }
}