package com.home.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFindAny
{
    public static void main(String[] args) {

        Stream.of(11,55,33,77,22,88).findAny().ifPresent(s->System.out.println(s));

        List<String> list = Arrays.asList("Mahesh", "Suresh", "Mohit");
        String output = list.stream()
                .filter(e -> e.startsWith("M"))
                .findAny()
                .orElse("NA");
        System.out.println(output);

        List<Integer> numList = Arrays.asList(21, 22, 23, 24);
        numList.stream()
                .filter(n -> n % 2 == 0)
                .findAny()
                .ifPresent(e -> System.out.println(e));


        List<User> list1 = new ArrayList<>();
        list1.add(new User("Emp A", 20));
        list1.add(new User("Emp B", 30));
        list1.add(new User("Emp C", 35));
        list1.add(new User("Emp D", 40));

        list1.stream()
                .filter(e -> e.getAge() >= 30 && e.getAge() <= 40)
                .mapToInt(e -> e.getAge())
                .findAny()
                .ifPresent(s -> System.out.println(s));

        Stream.of(null, "AA").
                findAny().ifPresent(s -> System.out.println(s));

    }
}
