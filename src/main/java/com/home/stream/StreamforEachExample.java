package com.home.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamforEachExample
{
    public static void main(String[] args) {

        List<User> list=new ArrayList<User>();
        list.add(new User("qwerty",30));
        list.add(new User("asdfg",25));
        list.add(new User("zxcvb",25));
        list.add(new User("poiuy",36));

        System.out.println("---Using lambda expression---");
        Consumer<User> ageBtwn25to35=user->{
            if (user.getAge()>=25 && user.getAge()<=35)
            {
                System.out.println(user.getUserName());
            }
        };
        list.forEach(ageBtwn25to35);

        System.out.println("\n---Using method reference---");
        list.forEach(User::showData);

        //To use Set.forEach method, we need to pass Consumer as lambda expression or method reference.
        Set<Integer> set = new HashSet<>();
        set.add(15);
        set.add(10);
        set.add(20);
        set.forEach(s -> System.out.println(s));
        set.forEach(System.out::println);

        //To use Queue.forEach method, we need to pass Consumer as lambda expression or method reference.
        //Find the example of forEach with Queue. We are instantiating Queue with its implementation class
        // ArrayDeque here.

        ArrayDeque<String> queue = new ArrayDeque<String>();
        queue.add("BB");
        queue.add("CC");

        queue.offerFirst("AA");
        queue.offerLast("DD");

        // With lambda expression
        queue.forEach(e -> System.out.println(e)); //AA, BB, CC, DD

        // With method reference
        queue.forEach(System.out::println); //AA, BB, CC, DD


        //To use Map.forEach method, we need to pass BiConsumer as lambda expression or method reference.
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Java");
        map.put(102, "Angular");
        map.put(103, "Spring");

        map.forEach((k, v) -> System.out.println(k + "-" + v));


        Map<Integer, User> map1 = new HashMap<>();
        map1.put(101, new User("Mahesh", 22));
        map1.put(102, new User("Suresh", 23));
        map1.put(103, new User("Krishn", 24));

        System.out.println("---Passing BiConsumer as lambda expression---");
        map1.forEach((k, v) -> {
            if (v.getAge() == 23) {
                System.out.println(k + " - " + v.getUserName());
            }
        });

        Stream<String> stream = Stream.of("Mahesh", "Nilesh", "Mohit");
        stream.forEach(e -> System.out.println(e)); //Mahesh, Nilesh, Mohit

        List<String> list1 = Arrays.asList("Mahesh", "Nilesh", "Mohit");
        list1.stream().filter(e -> e.startsWith("M")).forEach(e -> System.out.println(e)); //Mahesh, Mohit

        list1.stream().filter(e -> e.startsWith("M")).forEach(System.out::println); //Mahesh, Mohit

        list1.stream().sorted().forEach(e -> System.out.println(e)); //Mahesh, Mohit, Nilesh

    }
}
