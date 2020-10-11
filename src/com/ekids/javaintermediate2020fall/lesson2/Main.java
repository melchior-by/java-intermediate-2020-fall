package com.ekids.javaintermediate2020fall.lesson2;
/*  задание - продемонстрировать инкапсуляцию, наследование и полиморфизм в своих классах */

public class Main {
    private static Integer j = new Integer(20);
    public static void main(String[] args) {
        //1. Весь исполняемый код - в методах
        //2. Весь код - в классах
        //3. Классы могут лежать в пакетах
        //Java - object oriented language
        // значит Java реализует понятия:
        // инкапсуляция - сокрытие данных и предоставление возможности обращаться к ним через методы того же класса.
        // наследование - предоставление возможности наследования одной сущности от другой.
        // полиморфизм - возможность применения одноименных методов в одном классе или в группе классов, связанных отношением наследования
        System.out.println("j: " + j);
        CoronaVirus19 virus1 = new CoronaVirus19(80);
        CoronaVirus19 virus2 = new CoronaVirus19(60, 100000);
        //virus1.setRate(99); - удалили метод set не можем изменять значение rate
        System.out.println("Covid rate 1 = " + virus1.getRate());
        System.out.println("Covid rate 2 = " + virus2.getRate());
        System.out.println("Covid infected 1 = " + virus1.getInfected());
        System.out.println("Covid infected 2 = " + virus2.getInfected());
        System.out.println("Covid death rate 1 = " + virus1.getDeathRate());
        System.out.println("Covid death rate 2 = " + virus2.getDeathRate());
        virus1.print();
        virus2.print();
    }
}