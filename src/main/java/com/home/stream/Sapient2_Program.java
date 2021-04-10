package com.home.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Sapient2_Program
{
    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(1,2,3,4,5,4,3,4,3,5,6);
        Set<Integer> set=findDuplicate(list);
        set.forEach(System.out::println);

System.out.println("=============");
        Set<Integer> result = findDuplicateByFrequency(list);
        result.forEach(System.out::println);


    }

    private static Set<Integer> findDuplicate(List<Integer> list)
    {
        Set<Integer> number=new HashSet<Integer>();
        return list.stream()
                .filter(i->!number.add(i)).collect(Collectors.toSet());

    }

    public static  Set<Integer> findDuplicateByFrequency(List<Integer> list) {

        return list.stream().filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet());

    }
}
