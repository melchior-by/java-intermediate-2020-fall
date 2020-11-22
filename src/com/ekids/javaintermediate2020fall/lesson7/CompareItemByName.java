package com.ekids.javaintermediate2020fall.lesson7;

import java.util.Comparator;

public class CompareItemByName implements Comparator<Item>
{
    // Used for sorting in ascending order of name
    public int compare(Item a, Item b)
    {
        return a.getName().compareTo(b.getName());
    }
}
