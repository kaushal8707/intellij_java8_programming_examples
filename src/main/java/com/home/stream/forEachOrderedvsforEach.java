package com.home.stream;

import java.util.stream.Stream;

public class forEachOrderedvsforEach
{
    public static void main(String[] args) {

       Stream stream=Stream.of("c","d","a","b");
       stream.forEach(e->System.out.print(e+" "));
       System.out.println();

       System.out.println("Sequential Stream");
       Stream.of("c","d","a","b").forEach(e->System.out.print(e+"  "));
       System.out.println();
       Stream.of("c","d","a","b").forEachOrdered(e->System.out.print(e+"  "));
       System.out.println();
       System.out.println("Parallel Stream");
       Stream.of("c","d","a","b").parallel().forEach(e->System.out.print(e+"  "));
       System.out.println();
       Stream.of("c","d","a","b").parallel().forEachOrdered(e->System.out.print(e+"  "));



    }
}
