package com.home.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamOfExample
{
    public static void main(String[] args) {

        Stream<Integer> myStream=Stream.of(1,2,3,4,5);
        myStream.forEach(e->System.out.println(e));

        Stream myStream2=Stream.of("AA","CC","KK","FF");
        myStream2.forEach(e->System.out.println(e));

        Stream<User> userStream=Stream.of(
                new User("kau",23),
                new User("tup",43),
                new User("uyi",19)
        );
        userStream.forEach(user->System.out.println(user.getUserName()));


        System.out.println("--- IntStream ---");
        IntStream intStream = IntStream.of(12, 14, 16);
        intStream.forEach(e -> System.out.println(e));

        System.out.println("--- LongStream ---");
        LongStream longStream = LongStream.of(154L, 236L, 306L);
        longStream.forEach(e -> System.out.println(e));

        System.out.println("--- DoubleStream ---");
        DoubleStream doubleStream = DoubleStream.of(123.56, 456.87, 784.65);
        doubleStream.forEach(e -> System.out.println(e));


    }
}
