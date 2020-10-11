package com.ekids.javaintermediate2020fall.lesson2;

public abstract class Virus {
    public void print() {
        System.out.println("Hello I am a virus!");
    }
    public abstract int getRate();
    public abstract Integer getInfected();
    public abstract Double getDeathRate();

}
