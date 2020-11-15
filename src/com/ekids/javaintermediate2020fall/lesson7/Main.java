package com.ekids.javaintermediate2020fall.lesson7;

import java.util.*;
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
                add(new Order(5, 12.5f));
                add(new Order(3, 8.99f));
                add(new Order(4, 14.99f));
            }
        };
        System.out.println(Arrays.asList(orders));

        FindOrder findOrder = new FindOrder();
        List<Order> suppliedOrders = findOrder.findSupplyOrders(10.0f, orders);
        System.out.println("We supply orders: " + suppliedOrders);
        //зачем нужны стримы
        System.out.println("We supply order numbers: " + suppliedOrders.stream().map(Order::getOrderId).collect(Collectors.toList()));

        Order firstToFulfillOrder = findOrder.findOrderWithMaxAmount(orders);
        System.out.println("Order with max amount: " + firstToFulfillOrder);

        Collections.sort(orders, new CompareOrderById());
        System.out.println(orders);

        // [ "key -> value", "key -> value", "key -> value" ]
        Map<String, Integer> cars = new HashMap<>();
        cars.put("BMW", 9);
        cars.put("Tesla", 10);
        cars.put("Lada", 1);
        System.out.println("Car's keys: " + cars.keySet());
        System.out.println("Car's entries: " + cars.entrySet());
        System.out.println("Is there Tesla in our rating? - " + cars.containsKey("Tesla"));
        System.out.println("Is there car with 10 rating in our board? - " + cars.containsValue(10));



    }
}