package com.home.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertJavaStreamtoArray
{
    public static void main(String[] args)
    {
        //we will convert stream of string into array of string
        List<String> list=Arrays.asList("a","b","c","d");
        String array[]=list.stream().toArray(String[] :: new);
        for(String str:array)
        {
            System.out.print(str+" ");
        }

        //find the example with lambda expression.
        List<String> list1 = Arrays.asList("rkj","uiy","rrt","qqt");
        String strArray[]=list1.stream().filter(e->e.startsWith("r")).toArray(size->new String[size]);
        for(String str:strArray)
        {
            System.out.print(str+" ");
        }

        //convert stream of integer into array of integer
        List<Integer> list2=Arrays.asList(1,5,2,3,7,4);
        Integer arr[]=list2.stream().map(e->e*e).toArray(Integer[]::new);
        for(Integer a: arr)
        {
            System.out.print(a+" ");
        }

        //In the above example we have used method reference. Now find the code with lambda expression.
        List<Integer> list3=Arrays.asList(5,1,8,2,9,3);
        Integer ar[]=list3.stream().map(e->e*10).toArray(size->new Integer[size]);
        for(Integer a:ar)
        {
            System.out.print(a+"  ");
        }

        //The toArray() method returns an Object array containing the elements of this stream.
        //we will convert a stream of string into array of string. We know that toArray() returns Object[],
        //so to convert it in our required datatype, we can use Arrays.copyOf method.

        Object objArr[]=Stream.of("aa","nn","dd").toArray();
        String arString[]=Arrays.copyOf(objArr,objArr.length,String[].class);
        for(String stAr : arString)
        {
            System.out.println(stAr);
        }

        //Using IntStream.toArray()
        int iAr[]=IntStream.of(6,1,4,2).toArray();
        for(int k:iAr)
        {
            System.out.print(k+"  ");
        }

        int[] intArray=Stream.of(4,1,2,3).mapToInt(a->a*2).toArray();
        for(int k:intArray)
        {
            System.out.print(k+"  ");
        }

        //We can convert stream into list and then convert list into array.
        // To convert stream into list we need to use collect(Collectors.toList()) on the stream.
        // To convert list into array we can use List.toArray method
        System.out.println("--- For String ---");
        String s[]=Stream.of("as","of","to","for","so")
                .collect(Collectors.toList())
                .toArray(new String[0]);
        for(String str:s)
        {
            System.out.println(str);
        }


        System.out.println("--- For Integer ---");
        Integer arrInt[]=Stream.of(3,1,7,6,2)
                .map(i->i*2)
                .collect(Collectors.toList())
                .toArray(new Integer[0]);
        for(Integer str:arrInt)
        {
            System.out.println(str);
        }

    }
}
