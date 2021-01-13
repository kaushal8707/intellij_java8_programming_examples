package com.home.stream;

import java.util.ArrayList;
import java.util.List;

public class Persons
{
    private String name;
    private int age;
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static List<Persons> getList() {
        List<Persons> list = new ArrayList<>();
        list.add(new Persons("Ram", 30));
        list.add(new Persons("Shyam", 20));
        list.add(new Persons("Shiv", 20));
        list.add(new Persons("Mahesh", 30));
        return list;
    }
}
