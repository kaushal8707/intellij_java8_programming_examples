package com.home.function;
import java.util.function.Function;

public class Employee
{
    public String name;
    public int age;
    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String customShow(Function<Employee,String> fun)
    {
        return fun.apply(this);
    }
}
