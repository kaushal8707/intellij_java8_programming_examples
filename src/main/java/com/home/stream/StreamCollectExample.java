package com.home.stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample
{
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,6,3,4,5);
        IntSummaryStatistics intSummaryStatistics=list.stream().collect(Collectors.summarizingInt(i->i));
        System.out.println(" sum = "+intSummaryStatistics.getSum());
        System.out.println(" count = "+intSummaryStatistics.getCount());
        System.out.println(" Average = "+intSummaryStatistics.getAverage());
        System.out.println(" Max = "+intSummaryStatistics.getMax());
        System.out.println(" Min = "+intSummaryStatistics.getMin());

        IntSummaryStatistics intSummaryStatistics1=list.stream().collect(Collectors.summarizingInt(i->i*i));
        System.out.println(" square of num = "+intSummaryStatistics1.getSum());


        //Stream.collect() with Collectors.joining()
        List<String> stringList=Arrays.asList("bha","kan","cha","raj","kau");
        String joiningString=stringList.stream().collect(Collectors.joining(", "));
        System.out.println("joining String = "+joiningString);

        //Stream.collect() with Collectors.averagingInt()
        List<Integer> list1= Arrays.asList(1,6,3,4,5);
        Double average1=list1.stream().collect(Collectors.averagingInt(i->i));
        Double average2=list1.stream().collect(Collectors.averagingInt(i->i*2));
        System.out.println("Average1 = "+average1+  "       Average2 = "+average2);

        //Stream.collect() with Collectors.counting()
        List<Integer> list2= Arrays.asList(1,6,3,4,5);
        long l=list2.stream().collect(Collectors.counting());
        System.out.println("Count : "+l);

        //Stream.collect() with Collectors.toList()
        String[] strArray = {"AA", "BB", "CC"};
        List<String> list3 = Arrays.stream(strArray).collect(Collectors.toList());
        List<String> list4 = Stream.of(strArray).collect(Collectors.toList());
        list3.forEach(s->System.out.println(s));
        list4.forEach(s->System.out.println(s));


        //Stream.collect() with Collectors.toMap()
        List<Person> personList=new ArrayList<Person>();
        personList.add(new Person(11,"kani"));
        personList.add(new Person(13,"kitt"));
        personList.add(new Person(15,"bitt"));
        personList.add(new Person(17,"bhar"));
        Map<Integer,String> map=personList.stream()
                .collect(Collectors.toMap(Person::getId,Person::getName));
        map.forEach((x,y)->System.out.println("key = "+x +", value="+y));







    }
}
