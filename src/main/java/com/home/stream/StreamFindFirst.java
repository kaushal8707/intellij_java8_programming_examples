package com.home.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFindFirst
{
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,7,4,1,9,11);
        Optional<Integer> optional=list.stream().findFirst();
        optional.ifPresent(e->System.out.println(e));

        list.stream().filter(num->num%2!=0).findFirst().ifPresent(s->System.out.println(s));


        //findFirst example with null value.
        Stream.of(null, "A").
                findFirst().ifPresent(s -> System.out.println(s));





    }
}
