package com.home.function;
import java.util.List;

public class MyNumber
{
  static void evenList(List<Integer> list)
  {
   list.forEach(a->
           {
             if(a%2==0)
             {
               System.out.print(a+"  ");
             }
           });
  }
  static void oddList(List<Integer> list)
  {
    list.forEach(a->
    {
      if(a%2!=0)
      {
        System.out.print(a+"  ");
      }
    });
  }
  static void statusPrint(List<Integer> list)
  {
      System.out.println(list.size()+"     print finished   \n");
  }
}
