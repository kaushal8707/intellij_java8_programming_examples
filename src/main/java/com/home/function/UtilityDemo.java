package com.home.function;
import java.util.Map;

public class UtilityDemo
{
    static void updatedata(Map<Integer,String> map)
    {
        map.replaceAll((k,v)->v.concat("singh"));
    }

    static void displaydata(Map<Integer,String> map)
    {
        map.forEach((k,v)->System.out.println("Key-"+k+"  -  "+" value-"+v));
    }
}
