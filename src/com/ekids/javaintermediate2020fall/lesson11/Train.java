package com.ekids.javaintermediate2020fall.lesson11;

public class Train extends Thread {
    // reference to Line's Object.
    Line line;

    Train(Line line) {
        this.line = line;
    }

    @Override
    public void run() {
        line.getLine();
    }
}
