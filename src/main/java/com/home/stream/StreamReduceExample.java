package com.home.stream;
import java.util.Arrays;

public class StreamReduceExample
{
    public static void main(String[] args) {
        int[] array1 = {23,43,56,97,32};
        Arrays.stream(array1).reduce((x,y)->x+y).ifPresent(d->System.out.println(d));
        Arrays.stream(array1).reduce(Integer::sum).ifPresent(s->System.out.println(s));
        Arrays.stream(array1).reduce(StatisticsUtility::addInteger).ifPresent(s->System.out.println(s));


        //Stream.reduce() with Identity and Accumulator
        int[] array = {23,43,56,97,32};
        //Set start value. Result will be start value + sum of array.
        int startValue = 100;
        int sum = Arrays.stream(array).reduce(startValue, (x,y) -> x+y);
        System.out.println(sum);
        sum = Arrays.stream(array).reduce(startValue, Integer::sum);
        System.out.println(sum);
        sum = Arrays.stream(array).reduce(startValue, StatisticsUtility::addInteger);
        System.out.println(sum);

        //

    }
}
