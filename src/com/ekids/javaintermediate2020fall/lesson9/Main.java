package com.ekids.javaintermediate2020fall.lesson9;

//ДЗ - использовать дженерик для написания собственных: 1. метода, 2. класса

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        /*
         * Дженерики повышают качество кода
         * */
        /*Без дженериков: */
        List badList = new ArrayList();
        badList.add(10);
        badList.add(25);

        badList.add("30");

        Integer result = (Integer) badList.get(0) + (Integer) badList.get(1);
        /* плохая ситуация - код скомпилруется но упадет во время исполнения на
        java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        Integer result2 = (Integer)someList.get(0) + (Integer)someList.get(2);*/
        System.out.println(result);

        /*С дженериками: */
        List<Integer> goodList = new ArrayList<>();
        goodList.add(10);
        goodList.add(25);

        goodList.add(new Integer("30")); //программисту который захочет записать строку в лист чисел придется подумать
        Integer result3 = goodList.get(0) + goodList.get(2);
        System.out.println(result3);

        String[] arr = {"10", "100", "1000"};
        print(arr);

        /*спустя какое-то время захочется написать такой код и придется написать еще 1 метод print()*/

        Integer[] intArr = {10, 100, 1000};
        print(intArr);
        /*с дженериком*/
        genericPrint(intArr);

        genericClassPrint("100");
        genericClassPrint(100);

        /*можем использовать типизацию в классах*/
        TestContainer<String> stringTestContainer = new TestContainer<>("hello");
        System.out.println(stringTestContainer.getObject());

        TestContainer<Integer> integerTestContainer = new TestContainer<>(100);
        System.out.println(integerTestContainer.getObject());

        Account<String> stringAccount = new Account<>("99", 1000);
        Account<Integer> integerAccount = new Account<>(999, 10000);
        System.out.println("str acc - " + stringAccount.getSum() + " ,int acc- " + integerAccount.getSum());

    }

    /*Дублирование кода*/
    public static void print(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void print(Integer[] arr) {
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }

    /*Без дублирования*/
    public static <T> void genericPrint(T[] arr) {
        for (T integer : arr) {
            System.out.println(integer);
        }
    }

    static <T> void genericClassPrint(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    //знакомимся с типом Т - возвращаемое значение тоже типизируем этим типом
    public <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

}