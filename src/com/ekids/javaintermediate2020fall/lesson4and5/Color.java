package com.ekids.javaintermediate2020fall.lesson4and5;
//тип данных ENUM - похож на класс с жёстко заданными значениями
public enum Color {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
