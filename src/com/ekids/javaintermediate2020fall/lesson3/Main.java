package com.ekids.javaintermediate2020fall.lesson3;

//ДЗ - продемонстрировать инкапсуляцию, наследование и полиморфизм в своих классах

public class Main {

    public static void main(String[] args) {
        //Java - object oriented language
        // значит Java реализует понятия:
        // инкапсуляция - сокрытие данных и предоставление возможности обращаться к ним через методы того же класса.
        // наследование - предоставление возможности наследования одной сущности от другой.
        // 1. class extends class
        // полиморфизм - возможность применения одноименных методов в одном классе или в группе классов, связанных отношением наследования
        // 1. if class extends class, then - we can override(переопределить) methods
        // 2. we can create 2 methods with different parameters - overload(перегрузка) - можем создать несколько методов с
        // одинаковым названием и разным числом/типом параметров

        // мы можем придать дополнительные свойства классам, но тогда придется переделывать иерархию классов
        // выход - использовать интерфейсы
        //тип ссылки                      тип объекта
        DevelopedCountry japan2020 = new Japan("Nihongo", 5_888_000_000_000.0, 125_960_000);
        japan2020.isCool();
        japan2020.isPopular();
        //                   приведение переменной к типу
        System.out.println(((Country) japan2020).getGDP());
        //String abc = ((Integer) japan2020).toHexString(10); - не работает

        System.out.println("\n///////////////////////////////////////////");

        Japan japan1990 = new Japan("Nihongo", 4_888_000.0, 130_960_000);
        japan1990.printRating(83.2);
        japan1990.isAnime();
        japan1990.isCool();
        japan1990.isPopular();

        System.out.println("\n///////////////////////////////////////////");

        Country japan1900 = new Japan("Nihongo", 5_888_000.0, 65_960_000);
        japan1900.printRating(55.2);
        ((Japan) japan1900).isAnime();
    }
}
