package com.ekids.javaintermediate2020fall.lesson2;

public class CoronaVirus19 extends Virus {
    private int rate;
    private Integer infected;

    public CoronaVirus19(int rate) {
        this.rate = rate;
        infected = 100;
    }

    public CoronaVirus19(int rate, Integer infected) {
        this.rate = rate;
        this.infected = infected;
    }

    @Override
    public int getRate() {
        return rate;
    }

    @Override
    public Integer getInfected() {
        return infected;
    }

//    public void setRate(int rate) {
//        this.rate = rate;
//    }

    public void setInfected(Integer infected) {
        this.infected = infected;
    }

    @Override
    public Double getDeathRate() {
        return (infected < 10_000) ? (rate * 0.5) : rate * 0.9;
    }

    @Override
    public void print() {
        if (rate > 70) {
            System.out.println("Suspicious, may be not a corona, too deadly ");
        } else {
            System.out.println("Hello I am a corona-virus!");
        }
    }

}
