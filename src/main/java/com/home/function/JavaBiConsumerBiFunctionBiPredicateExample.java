package com.home.function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class JavaBiConsumerBiFunctionBiPredicateExample
{
    public static void main(String[] args) {

        //BiConsumer Example

        //In our example we have declared a BiConsumer that will simply print the value of both parameter.
        // To do this we have taken a map which has two parameter key and value. We will print the value
        // of map with the help of BiConsumer.

        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"asd");
        map.put(2,"ert");
        map.put(3,"lky");
        map.put(4,"klj");

        BiConsumer<Integer,String> biConsumer=(k,v)->System.out.println("key="+k+"  "+"value="+v);
        map.forEach(biConsumer);
        //using method accept to call BiConsumer
        biConsumer.accept(2,"asd");


        //BiFunction Example
        BiFunction<Integer,Integer,String> biFunction=(num1,num2)->"Result ="+(num1+num2);
        System.out.println(biFunction.apply(3,2));

        //BiPredicate Example
        BiPredicate<Integer,String> biPredicate=(i,s)->i>10 && s.startsWith("K");
        System.out.println(biPredicate.test(10,"Kaushal"));
        System.out.println(biPredicate.test(12,"Ramesh"));
        System.out.println(biPredicate.test(11,"Kaushal"));

    }
}
