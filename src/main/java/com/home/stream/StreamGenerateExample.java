package com.home.stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerateExample
{
    public static void main(String[] args) {

        //generate 5 Random Integer
        Stream.generate(()->new Random().nextInt(10)).limit(6).forEach(d->System.out.println(d));
        System.out.println("---------------------------------------------------------------------");

        //generate 5 Random Boolean
        Stream.generate(()->new Random().nextBoolean()).limit(5).forEach(e->System.out.println(e));
        System.out.println("---------------------------------------------------------------------");

        //example to generate constant stream
        Stream.generate(()->"Hi Kaushal").forEach(r->System.out.println(r));

        //generate Random Integer
        Stream<Integer> stream=Stream.generate(()->new Random().nextInt(10));
        stream.forEach(d->System.out.println(d));

        //generate Random Boolean
        Stream.generate(()->new Random().nextBoolean()).forEach(e->System.out.println(e));
    }
}
