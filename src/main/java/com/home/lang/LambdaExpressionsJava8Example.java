package com.home.lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LambdaExpressionsJava8Example
{
    public static void main(String[] args) {

        //Using Runnable with Lambda Expression
        final ExecutorService executorService=
                Executors.newSingleThreadExecutor();
        Runnable r=()->System.out.println("Lambda Expression with runnable  ");
        executorService.execute(r);


        //User defined Functional Interface Example with Lambda Expression
        Calculator calculator=(int a,int b)->a+b;
        int result=calculator.add(3,5);
        System.out.println(result);

        //Using Comparator with Lambda Expression
        List<Student> list=new ArrayList<Student>();
        list.add(new Student("klj",16));
        list.add(new Student("bnm",98));
        list.add(new Student("oip",56));
        list.add(new Student("cty",45));

        //Before sorting
        for(Student student:list)
        {
            System.out.println(student.getName());
        }
        //define comparator
        Comparator<Student> comparator=(Student s1,Student s2)->s1.getName().compareTo(s2.getName());
        Collections.sort(list,comparator);
        //After sorting
        for(Student student:list)
        {
            System.out.println(student.getName());
        }

        // Using Function Interface to Iterate Collection with Lambda Expression

        List<Student> list2 = new ArrayList();
        list2.add(new Student("Ram",20));
        list2.add(new Student("Shyam",22));
        list2.add(new Student("Kabir",18));
        for(Student st: list2){
            System.out.println(st.customShow(s->s.getName()+": "+s.getAge()));
        }
    }
}
