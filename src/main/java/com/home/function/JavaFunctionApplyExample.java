package com.home.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class JavaFunctionApplyExample
{
    public static void main(String[] args) {

        List<Employee> list=new ArrayList<Employee>();
        list.add(new Employee("asc",13));
        list.add(new Employee("fdr",19));
        list.add(new Employee("hyt",18));
        list.add(new Employee("cfu",34));

        //Simple use of function
        for(Employee emp : list)
        {
            System.out.println(emp.customShow(s->s.age+"--"+s.name));
        }
        //Style one to declare function
       Function<Employee,String> styleOne=o->
       {
         String result="Name="+ o.name+"Age="+o.age;
         return result;
       };
        //Style two to declare function
        Function<Employee,String> styleTwo=s-> "Name="+ s.name+"Age="+s.age;


        System.out.println("--print value by style one--");
        //print the values of list using style one function
        for(Employee emp : list)
        {
            System.out.println(emp.customShow(styleOne));
        }
        System.out.println("--print value by style two--");
        //print the values of list using style two function
        for(Employee emp : list)
        {
            System.out.println(emp.customShow(styleTwo));
        }
    }
}
