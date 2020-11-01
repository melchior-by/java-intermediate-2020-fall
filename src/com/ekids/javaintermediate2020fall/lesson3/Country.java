package com.ekids.javaintermediate2020fall.lesson3;

public class Country {
    private String name; // countryName или name ? -> всегда только name
    private Double gdp;
    private Integer population;

    public Country(String name, Double gdp, Integer population) {
        this.name = name;
        this.gdp = gdp;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public Double getGDP() {
        return gdp;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGDP(Double gdp) {
        this.gdp = gdp;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    // мы можем использовать одно и то же имя метода в одном классе, если:
    // колличество и/или тип параметров отличается
    public void printRating() {
        System.out.println(gdp / population);
    }

    public void printRating(Double lifeExpectancy) {
        System.out.println((gdp / population) * lifeExpectancy);
    }

    public void printRating(Integer nobelPrizeWinners) {
        System.out.println((gdp / population) * nobelPrizeWinners);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", gdp=" + gdp +
                ", population=" + population +
                '}';
    }
}
