package com.home.stream;
import java.util.*;
import java.util.stream.Collectors;

public class StreamSortedExample
{
    public static void main(String[] args) {

        //Stream sorted() with List
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Mahesh", 12));
        list.add(new Student(2, "Suresh", 15));
        list.add(new Student(3, "Nilesh", 10));

        System.out.println("---Natural Sorting by Name---");
        List<Student> slist=list.stream().sorted().collect(Collectors.toList());
        slist.forEach(e->System.out.println(e.getId()+"---"+e.getName()+"---"+e.getAge()));

        System.out.println("---Natural Sorting by Name in reverse order---");
        List<Student> rslist=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        rslist.forEach(e->System.out.println(e.getId()+"---"+e.getName()+"---"+e.getAge()));

        System.out.println("---Sorting using Comparator by Age---");
        List<Student> rsalist=list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
        rsalist.forEach(e->System.out.println(e.getId()+" - "+e.getName()+" - "+e.getAge()));


        System.out.println("---Sorting using Comparator by Age with reverse order---");
        slist = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));




        Set<Student> set = new HashSet<Student>();
        set.add(new Student(1, "Mahesh", 12));
        set.add(new Student(2, "Suresh", 15));
        set.add(new Student(3, "Nilesh", 10));

        System.out.println("---Natural Sorting by Name---");
        set.stream().sorted().forEach(e -> System.out.println("Id:"
                + e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("---Natural Sorting by Name in reverse order---");
        set.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println("Id:"
                + e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("---Sorting using Comparator by Age---");
        set.stream().sorted(Comparator.comparing(Student::getAge))
                .forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("---Sorting using Comparator by Age in reverse order---");
        set.stream().sorted(Comparator.comparing(Student::getAge).reversed())
                .forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));


        Map<Integer, String> map = new HashMap<>();
        map.put(15, "Mahesh");
        map.put(10, "Suresh");
        map.put(30, "Nilesh");

        System.out.println("---Sort by Map Value---");
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e -> System.out.println("Key: "+ e.getKey() +", Value: "+ e.getValue()));

        System.out.println("---Sort by Map Key---");
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> System.out.println("Key: "+ e.getKey() +", Value: "+ e.getValue()));



        //Here we are sorting a map whose values are custom objects.
        Map<Integer, Student> map1 = new HashMap<>();
        map1.put(1, new Student(1, "Mahesh", 12));
        map1.put(2, new Student(2, "Suresh", 15));
        map1.put(3, new Student(3, "Nilesh", 10));
        //Map Sorting by Value i.e student's natural ordering i.e by name
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e -> {
                    Integer key = (Integer)e.getKey();
                   // Student std = (Student)e.getValue();
                   // System.out.println("Key: " + key +", value: ("+ std.getId() +", "+ std.getName()+", "+ std.getAge()+")");
                });
    }
}
