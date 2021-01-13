package com.home.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaPredicateExample
{
    public static void main(String[] args) {

        //test(T t) Example
        // Is username valid
        Predicate<String> usernameValid=u->u!=null && u.length() >5 && u.length()<10;
        System.out.println("username valid "+usernameValid.test("kaushal"));
        // Is password valid
        Predicate<String> passwordValid=p->p!=null && p.length() >5 && p.length()<10;
        System.out.println("password valid "+passwordValid.test("kaushal29"));
        // Word match
        Predicate<String> wordMatch=w->w!=null && w.startsWith("kau");
        System.out.println("word match = "+wordMatch.test("kaushal@29"));
        //Odd numbers
        Predicate<Integer> oddNumber=o->o%2!=0;
        for(int i=0;i<=10;i++)
        {
            System.out.print(i+"  "+oddNumber.test(i)+"   ");
        }

        //Predicate Demo 2 Example
        Predicate<Student> maleStudent = s-> s.getAge() >= 20 && "male".equals(s.getGender());
        Predicate<Student> femaleStudent = s-> s.getAge() > 18 && "female".equals(s.getGender());

        Function<Student,String> maleStyle = s-> "Hi, You are male and age "+s.getAge();
        Function<Student,String> femaleStyle = s-> "Hi, You are female and age "+ s.getAge();

        Student s1 = new Student("Gauri", 20,"female");
        if(maleStudent.test(s1)){
            System.out.println(s1.customShow(maleStyle));
        }else if(femaleStudent.test(s1)){
            System.out.println(s1.customShow(femaleStyle));
        }

        //Predicate with Filter
        List<String> list = new ArrayList<>();
        list.add("Vijay");
        list.add("Ramesh");
        list.add("Mahesh");

        Predicate<String> isNameEndsWithSh = s -> s.endsWith("sh");

        list.stream().filter(isNameEndsWithSh)
                .forEach(s -> System.out.println(s));


        //Predicate with Example 3
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Mahesh", 20, "male", 38));
        list1.add(new Student("Gauri", 21, "female", 45));
        list1.add(new Student("Krishna", 19, "male", 42));
        list1.add(new Student("Radha", 20, "female", 35));

        System.out.println("--- All students scoring marks > 40 ---");
        Predicate<Student> isScoreGt40 = std -> std.getMarks() > 40;
        filterStudent(isScoreGt40, list1).forEach(s -> System.out.println(s));

        System.out.println("--- All Male Students ---");
        Predicate<Student> isMaleStudent = std -> "male".equals(std.getGender());
        filterStudent(isMaleStudent, list1).forEach(s -> System.out.println(s));

        System.out.println("--- All Female Students ---");
        Predicate<Student> isFemaleStudent = std -> "female".equals(std.getGender());
        filterStudent(isFemaleStudent, list1).forEach(s -> System.out.println(s));

        System.out.println("--- All Female Students scoring > 40 ---");
        filterStudent(isFemaleStudent.and(isScoreGt40), list1).forEach(s -> System.out.println(s));
    }

    static List<Student> filterStudent(Predicate<Student> predicate, List<Student> list) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
    }
