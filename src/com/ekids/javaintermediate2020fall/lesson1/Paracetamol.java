package com.ekids.javaintermediate2020fall.lesson1;

public class Paracetamol implements Medicine {

    @Override
    public boolean cure(String condition) {
        if("головная боль".equals(condition)) {
            return true;
        }

        return false;
    }
}