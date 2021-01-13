package com.home.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDistinctExample
{
    public static void main(String[] args) {

        List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");
        long l = list.stream().distinct().count();
        System.out.println("No. of distinct elements:"+l);
        list.stream().distinct().forEach(e->System.out.println(e));


        //In this example we have a list of user object.
        // The class will override hashCode() and equals() in order to get distinct elements.

        List<Book> list1 = new ArrayList<>();
        {
            list1.add(new Book("Core Java", 200));
            list1.add(new Book("Core Java", 200));
            list1.add(new Book("Learning Freemarker", 150));
            list1.add(new Book("Spring MVC", 300));
            list1.add(new Book("Spring MVC", 300));
        }
        long l1 = list1.stream().distinct().count();
        System.out.println("No. of distinct books:"+l1);
        list1.stream().distinct().forEach(b -> System.out.println(b.getBookName()+ "," + b.getPrice()));
    }
}
