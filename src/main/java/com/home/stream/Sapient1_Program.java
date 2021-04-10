
// Sum of all Even Number.......!!!

package com.home.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sapient1_Program
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<=100;i++)
        {
            list.add(i);
        }
        Predicate<Integer> listOfEven=(i)->i%2==0;
        long sum=list.stream().filter(listOfEven)
                .collect(Collectors.summarizingInt(i->i))
                .getSum();
        System.out.println(sum);
    }
}
