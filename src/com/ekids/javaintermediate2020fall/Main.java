package com.ekids.javaintermediate2020fall;

import java.util.ArrayList;
import java.util.List;

public class Main {
    int i = 0;

    public static void printBlahBla(String str) {
        if (str.length() > 0) {
            System.out.println(str + "blahblah");
        }
    }

    public static void printGrades(String user, int[] grades) {
        if (grades.length > 0) {
            System.out.print("User " + user + " have this grades: ");
            for (int i = 0; i < grades.length; i++) {
                System.out.print("" + grades[i] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        //1. типы данных
        // 1.1. примитивные - char, byte, int, double, float, boolean
        // int i = 0; -> в стэк
        // 1.2. объектные - String
        // String country = "Belarus";
        // Integer age = new Integer();
        //2. операции, операторы - +,-,*,/, ==, <, >, <=, >=, --, ++
        // 2.1 и - &&, или - ||
        // 2 + 2, j = i++;
        //3. Классы, Интерфейсы
        //4. Методы
        //5. Операторы - if, if-else, for, while, do-while
        //6. Массивы
        int[] grades = new int[2];
        grades[0] = 5;
        grades[1] = 10;
        printGrades("Vasya", grades);
        //7. Структуры данных - List -> ArrayList
        List someList = new ArrayList<Integer>();
        someList.add(10);
        someList.add(9);
        someList.add(9);
        someList.add(9);
        someList.forEach(e -> System.out.println(e));
    }
}
