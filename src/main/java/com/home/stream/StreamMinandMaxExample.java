package com.home.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMinandMaxExample
{
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(3,5,1,2,9);
        Comparator<Integer> comparator=Comparator.comparing(Integer::intValue);
        Optional<Integer> optionalInteger=list.stream().min(comparator);
        optionalInteger.ifPresent(e->System.out.println(" M i n : "+e));

        Comparator comparator2=Comparator.comparing(Integer::intValue);
        Optional<Integer> optional=list.stream().max(comparator2);
        optional.ifPresent(d->System.out.println("Max : "+d));

        List<String> strList=Arrays.asList("vhj","mkj","kio","fgt");
        Comparator<String> stringComparator=Comparator.comparing(String::valueOf);
        Optional<String> stringOptional=strList.stream().min(stringComparator);
        stringOptional.ifPresent(d->System.out.println("Minimum value in String data : "+d));

        //Min and Max for Object
        List<User> listOfObjects=Arrays.asList(
                new User("kaushal",33),
                new User("nagraju",77),
                new User("columbus",82)
                );

        System.out.println("---Min and Max on the basis of user name---");
        listOfObjects.stream().min(Comparator.comparing(u->u.getUserName()))
                .ifPresent(e->System.out.println(e.getUserName()));

        listOfObjects.stream().max(Comparator.comparing(u->u.getUserName()))
                .ifPresent(e->System.out.println(e.getUserName()));


        System.out.println("---Min and Max on the basis of age---");
        listOfObjects.stream().min(Comparator.comparing(u->u.getAge()))
                .ifPresent(e->System.out.println(e.getUserName()));

        listOfObjects.stream().max(Comparator.comparing(User::getAge))
                .ifPresent(e->System.out.println(e.getUserName()));




    }
}
