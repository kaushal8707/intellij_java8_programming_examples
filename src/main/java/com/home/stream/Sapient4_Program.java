package com.home.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sapient4_Program
{
    public static void main(String[] args)
    {
        List<StudentSapient> list= Arrays.asList(new StudentSapient(5,"zrtt",12),
                new StudentSapient(1,"raj",56),
                new StudentSapient(2,"hansh",23),
                new StudentSapient(3,"komal",34),
                new StudentSapient(4,"raghu",45)
        );
        int max=list.stream().collect(Collectors.summarizingInt(StudentSapient::getScore)).
                getMax();
        System.out.println(max);
    }
}
