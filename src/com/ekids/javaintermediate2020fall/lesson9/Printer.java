package com.ekids.javaintermediate2020fall.lesson9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Printer {
    public <T> void print(T[] items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    static <T> void genericPrint(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }
    /*особо не вникайте - просто пример того что использовать дженерик можно не только для 1 типа*/
    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }
}
