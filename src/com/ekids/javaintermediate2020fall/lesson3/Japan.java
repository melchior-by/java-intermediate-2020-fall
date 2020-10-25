package com.ekids.javaintermediate2020fall.lesson3;

public class Japan extends Country implements DevelopedCountry {
    public Japan(String name, Double gdp, Integer population) {
        super(name, gdp, population);
    }

    public void isAnime() {
        System.out.println("Cavaiiiiiiii");
    }

    @Override
    public void isPopular() {
        printRating();
        if (getGDP() > 100) {
            System.out.println("This country is popular");
        }
    }
}
