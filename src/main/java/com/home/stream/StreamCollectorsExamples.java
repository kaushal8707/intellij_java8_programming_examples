package com.home.stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectorsExamples
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        Double result = list.stream().collect(Collectors.averagingDouble(d->d*2));
        System.out.println(result);

        List<Integer> list1 = Arrays.asList(1,2,3,4);
        Double result1 = list1.stream().collect(Collectors.averagingInt(v->v*2));
        System.out.println(result1);

        List<Integer> list2 = Arrays.asList(1,2,3,4);
        Double result2 = list2.stream().collect(Collectors.averagingLong(v->v*2));
        System.out.println(result2);

        List<Integer> list3 = Arrays.asList(1,2,3,4);
        Double result3 = list3.stream().collect(Collectors.collectingAndThen(Collectors.averagingLong(v->v*2),
                s-> s*s));
        System.out.println(result3);

        List<Integer> list4 = Arrays.asList(1,2,3,4);
        long result4=  list4.stream().collect(Collectors.counting());
        System.out.println(result4);

        List<String> list5 = Arrays.asList("A","B","C","D");
        String result5=  list5.stream().collect(Collectors.joining(",","(",")"));
        System.out.println(result5);

        List<Integer> list6 = Arrays.asList(30,10,20,35);
        int result6 = list6.stream().collect(Collectors.summingInt(i->i));
        System.out.println(result6);

        List<Long> list7 = new ArrayList<>();
        list7.add((long)340);
        list7.add((long)240);
        list7.add((long)360);
        long result7 = list7.stream().collect(Collectors.summingLong(l->l));
        System.out.println(result7);

        List<Double> list8 = Arrays.asList(340.5,234.56,672.76);
        Double result8 = list8.stream().collect(Collectors.summingDouble(d->d));
        System.out.println(result8);

        List<String> list9 = Stream.of("AA","BB","CC").collect(Collectors.toList());
        list9.forEach(s->System.out.println(s));

        Set<String> set = Stream.of("AA","AA","BB").collect(Collectors.toSet());
        set.forEach(s->System.out.println(s));

        Map<String,String> map = Stream.of("AA","BB","CC").collect(Collectors.toMap(k->k, v->v+v));
        map.forEach((k,v)->System.out.println("key:"+k +"  value:"+v));

        List<Persons> list10 = Persons.getList();
        Map<Integer, String> nameByAge
                = list10.stream().collect(Collectors.groupingBy(Persons::getAge,
                Collectors.mapping(Persons::getName, Collectors.joining(","))));
        nameByAge.forEach((k,v)->System.out.println("Age:"+k +"  Persons: "+v));

    }
}