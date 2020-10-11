package com.ekids.javaintermediate2020fall.lesson3;

public interface DevelopedCountry {

    void isPopular(); //объявляем методы

    default void isCool() {
        System.out.println("This is very cool country");
    }

}
