package com.ekids.javaintermediate2020fall.lesson8;

//ДЗ - 1. Создать свой класс, 2. Создать коллекцию элементов этого класса, 3. Воспользоваться map() и filter() 3 раза по разному

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //зачем стримы ?
        //1. улучшение качества кода
        //2. существенное улучшение быстродействия
        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
                .limit(3).forEach(System.out::print);
        System.out.println();

        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x += 10;
            count++;
            if (count > 3) break;
            System.out.print(x);
        }
        System.out.println();

        //создание стримов
        // любая_коллекция.stream() - 99% кода для создания стримов
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        System.out.println(streamOfCollection.collect(Collectors.toList()));

        Stream<String> streamBuilder = Stream.<String>builder().add("c").add("b").add("a").build();
        System.out.println(streamBuilder.collect(Collectors.toList()));

        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
        System.out.println(streamGenerated.collect(Collectors.toList()));

        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
        System.out.println(streamIterated.collect(Collectors.toList()));

        List<Item> items = new ArrayList<Item>() {
            {
                add(new Item(1, 10.1f, "Lemons"));
                add(new Item(5, 12.5f, "Potatoes"));
                add(new Item(3, 8.99f, "Carrots"));
                add(new Item(4, 14.99f, "Crabs"));
            }
        };
        // 2 сповоба оработки элемента коллекции - через ссылку на метод и используя лямбду
        List<String> collectorCollection = items.stream().map(Item::getName).collect(Collectors.toList());
        List<String> collectorCollectionAnotherWrite = items.stream().map(i -> i.getName()).collect(Collectors.toList());
        System.out.println(collectorCollection);
        System.out.println(collectorCollectionAnotherWrite);

        //мы можем вызывать сколько угодно промежуточных операций
        //map - как-то изменяет каждый из элементов
        //filter - фильтрует обрабатываемые значения
        //limit - ограничить колличеством значений
        List<String> filteredCollection = items.stream()
                .filter(item -> item.getPrice() < 12)
                .map(Item::getName)
                .collect(Collectors.toList());
        System.out.println(filteredCollection);
        //даже одинаковые промежуточные операции
        List<String> filteredCollection2 = items.stream()
                .filter(item -> item.getPrice() < 12)
                .filter(i -> i.getItemId() > 2)
                .map(Item::getName)
                .collect(Collectors.toList());
        System.out.println(filteredCollection2);

        //можем применять разные терминальные операторы, в частости коллекторы
        //joining() - созвращает String содержащий результат промежуточных операций
        String listToString = items.stream().map(Item::getName)
                .collect(Collectors.joining("; ", "{", "}"));
        System.out.println(listToString);
        //averagingDouble() - коллектор который посчитает среднее значение
        Double averagePrice = items.stream()
                .collect(Collectors.averagingDouble(Item::getPrice));
        //summingDouble() - коллектор который посчитает сумму после всех промежуточных операций
        Double summingPrice = items.stream()
                .collect(Collectors.summingDouble(Item::getPrice));
        System.out.println("Average price: " + averagePrice + ", sum: " + summingPrice);
        //или терминальные операторы, которые не являются коллекторами
        boolean coolFood = items.stream().anyMatch(item -> item.getPrice() > 14);
        boolean allFoodIsHomeGrown = items.stream().allMatch(item -> item.getItemId() > 2);
        System.out.println("We have cool food: " + coolFood);
        System.out.println("All products is homegrown: " + allFoodIsHomeGrown);
    }
}