package com.ekids.javaintermediate2020fall.lesson9;

class TestContainer<T> {
    private T obj;
    
    TestContainer(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}