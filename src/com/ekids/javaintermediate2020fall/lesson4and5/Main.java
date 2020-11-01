package com.ekids.javaintermediate2020fall.lesson4and5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //константные (неизменяемые значение) -  только большими буквами
        final double PI = 3.14;

        int i = 0;
        // пул строк
        String str = "one";
        String str2 = "two";
        String str3 = "one";
        String str4 = new String("one");
        System.out.println(str + " " + str2 + " " + str3 + " " + str4);
        System.out.println(str.hashCode() + " " + str2.hashCode() + " " + str3.hashCode() + " " + str4.hashCode());
        /* как это выглядит в памяти
         *  - @ --
         *  - @  *
         * ------*
         */
        str3 = "new";
        System.out.println(str + " " + str2 + " " + str3);
        System.out.println(str.hashCode() + " " + str2.hashCode() + " " + str3.hashCode());
        str3 = "two";

        System.out.println(str + " " + str2 + " " + str3);
        System.out.println(str.hashCode() + " " + str2.hashCode() + " " + str3.hashCode());

        //ENUM
        Color someColor = Color.RED;
        System.out.println(Arrays.toString(Color.values()));
        System.out.println(someColor + " hex code is " + someColor.getCode());

        //Array
        int arrray[] = {10, 2, 3}; //0: 10, 1: 2, 2: 3
        System.out.println(Arrays.toString(arrray));
        int[] array2 = new int[100];

        //Collections
        //[ "ajdbk", "agsksa", "ajskajgdjhas" ....] -> ArrayList
        List someArrayList = new ArrayList();
        someArrayList.add("asdas");
        someArrayList.add(new Integer(100));
        System.out.println(someArrayList.get(0));
        System.out.println(someArrayList.get(1));

        List<String> goodStringList = new ArrayList<>();
        goodStringList.add("asdas");
        goodStringList.add("ajsckaskk");
        System.out.println(goodStringList.get(0));
        System.out.println(goodStringList.get(1));
        System.out.println("********************************************");

        //[ (0, "ajdbk", 110182), (115276, "agsksa", 108960), (110182, "ajskajgdjhas", 1787878) ....] -> LinkedList
        // каждый элемент LinkedList это ссылка на предыдущий элемент, значение, ссылка на следующий
        LinkedList<Integer> someGoodLinkedList = new LinkedList<>();
        someGoodLinkedList.add(100);
        someGoodLinkedList.add(101);
        someGoodLinkedList.add(102);
        ((LinkedList) someGoodLinkedList).addFirst(99);
        // не теряем возможности поменять тип в дальнейшем и получаем возможность вызвать методы от Deque и Queue
        ((LinkedList) someGoodLinkedList).removeFirstOccurrence(101);
        someGoodLinkedList.forEach(System.out::println); //пример работы с forEach и Streams (Стримы)
        System.out.println("********************************************");

        //1 создать итератор
        Iterator<Integer> someGoodLinkedListIterator = someGoodLinkedList.iterator();
        //2 работать с коллекцией только через итератор
        // используем меоды итератора - hasNext(), next()
        while (someGoodLinkedListIterator.hasNext()) {
            System.out.println(someGoodLinkedListIterator.next());
        }
        System.out.println("********************************************");

        //или

        for (Integer integer : someGoodLinkedList) {
            System.out.println(integer);
        }
        System.out.println("********************************************");
    }
}
