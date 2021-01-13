package com.home.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class ParallelStreamDemo
{
    public static void main(String[] args) {

        //Parallel Stream
        List<Employees> list = new ArrayList<>();
        list.add(new Employees(1, "A", 2000));
        list.add(new Employees(2, "B", 3000));
        list.add(new Employees(3, "C", 4000));
        list.add(new Employees(4, "D", 5000));

        Predicate<Employees> seniorEmp = e -> e.sal > 3000 && e.sal < 6000;
        OptionalDouble averageSal = list.parallelStream().filter(seniorEmp)
                .mapToDouble(e -> e.sal).average();
        System.out.println(averageSal.getAsDouble());


        //Sequential Stream
        List<Employees> list1 = new ArrayList<>();
        list1.add(new Employees(1, "A", 2000));
        list1.add(new Employees(2, "B", 3000));
        list1.add(new Employees(3, "C", 4000));
        list1.add(new Employees(4, "D", 5000));

        Predicate<Employees> juniorEmp = e -> e.sal > 1000 && e.sal < 4000;
        int salsum = list1.stream().filter(juniorEmp)
                .mapToInt(e -> e.sal).sum();

        System.out.println(salsum);
    }
}
