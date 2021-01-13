package com.home.stream;

import java.util.Arrays;
import java.util.List;

public class StreamCountExample
{
    public static void main(String[] args) {

        List<Integer> numList=Arrays.asList(3,8,9,2,5);
        long count=numList.stream().count();
        System.out.println("count : "+count);

        //use the filter method with stream and then count the elements
        long c=numList.stream().filter(e -> e % 2 == 0).count();
        System.out.println("count with even number : "+c);

        List<String> strList=Arrays.asList("asd","qwe","ayu","iop");
        long value=strList.stream().filter(d->d.startsWith("a")).count();
        System.out.println("No. of strings starts with a :" +value);
        strList.stream().filter(d->d.startsWith("a")).forEach(e->System.out.println(e));


        //In this example we have a list of objects. We will filter the stream of list according to
        //given condition and then count the elements.
        List<User> listOfUser=Arrays.asList(
                new User("kaushal",32),
                new User("kanishk",28),
                new User("raju",34),
                new User("raghu",28)
        );
        long c1=listOfUser.stream().filter(user->user.getUserName().startsWith("ka")).count();
        System.out.println("users name starts with ka :"+c1);

        long c2=listOfUser.stream().filter(usr->usr.getAge()==28).count();
        System.out.println("no. of user whose age is 28 :"+c2);


    }
}
