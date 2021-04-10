package com.home.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sapient3_Program
{
    public static void main(String[] args) {
        List<StudentSapient> list= Arrays.asList(new StudentSapient(5,"zrtt",12),
                new StudentSapient(1,"raj",56),
                new StudentSapient(2,"hansh",23),
                new StudentSapient(3,"komal",34),
                new StudentSapient(4,"raghu",45)
                );
        //average score of all students.....
        double avg_score=list.stream().collect(Collectors.summarizingInt(StudentSapient::getScore))
                .getAverage();
        System.out.println(avg_score);

        //convert list to map and sort basd on name and score
        Map<String,Integer> map=list.stream().collect(Collectors.toMap(StudentSapient::getName,StudentSapient::getScore));
       //sorting based on score
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toList())
                .forEach(a->System.out.println(a.getKey()+"     "+a.getValue()));
        System.out.println("================================");
        //sorting based on Name
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toList())
                .forEach(a->System.out.println(a.getKey()+"     "+a.getValue()));

    }
}
