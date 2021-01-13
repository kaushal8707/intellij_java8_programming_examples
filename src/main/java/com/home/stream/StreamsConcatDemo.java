package com.home.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConcatDemo
{
    public static void main(String[] args) {

        Stream<String> s1=Stream.of("AA","BB","CC");
        Stream<String> s2=Stream.of("AA","BB","DD");
        Stream<String> s=Stream.concat(s1,s2);
        s.forEach(e->System.out.println(e));

        //Remove duplicates using distinct()
        s1=Stream.of("AA","BB","CC");
        s2=Stream.of("AA","BB","DD");
        System.out.println("Remove duplicates using distinct()\n");
        s=Stream.concat(s1,s2).distinct();
        s.forEach(e->System.out.println(e));

        //Concat Lists
        List<Book> list1 = new ArrayList<>();
        List<Book> list2 = new ArrayList<>();
        {
            list1.add(new Book("Core Java", 200));
            list1.add(new Book("Spring MVC", 300));
            list1.add(new Book("Learning Freemarker", 150));

            list2.add(new Book("Core Java", 200));
            list2.add(new Book("Spring MVC", 300));
            list2.add(new Book("Learning Hibernate", 400));
        }

        List<Book> list=Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
        list.forEach(b->System.out.println(b.getBookName()+"-----"+b.getPrice()));

        //Remove duplicates using distinct()
        System.out.println("--Remove duplicates using distinct()--");
        List<Book> list3=Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
        list3.forEach(b->System.out.println(b.getBookName()+"-----"+b.getPrice()));

        //Concat Arrays
        Book[] book1=new Book[3];
        Book[] book2=new Book[3];
        book1[0]=new Book("Core Java", 200);
        book1[1]=new Book("Spring MVC", 300);
        book1[2]=new Book("Learning Freemarker", 150);
        book2[0]=new Book("Core Java", 200);
        book2[1]=new Book("Spring MVC", 300);
        book2[2]=new Book("Learning Hibernate", 400);

        System.out.println("//Concat Arrays\n");
        Book book[]=Stream.concat(Stream.of(book1),Stream.of(book2))
                .toArray(b->new Book[b]);
        for (Book buk : book)
        {
            System.out.println(buk.getBookName()+"--->"+buk.getPrice());
        }

        System.out.println("--Remove duplicates using distinct()--\n");
        Book books[]=Stream.concat(Stream.of(book1),Stream.of(book2))
                .distinct()
                .toArray(b->new Book[b]);
        for (Book buk : books)
        {
            System.out.println(buk.getBookName()+"--->"+buk.getPrice());
        }

        // Concat Sets
        Set<Book> set1 = new HashSet<>();
        Set<Book> set2 = new HashSet<>();
        {
            set1.add(new Book("Core Java", 200));
            set1.add(new Book("Spring MVC", 300));
            set1.add(new Book("Learning Freemarker", 150));

            set2.add(new Book("Core Java", 200));
            set2.add(new Book("Spring MVC", 300));
            set2.add(new Book("Learning Hibernate", 400));
        }
        System.out.println("//Concat Sets \n");
        Set<Book> set=Stream.concat(set1.stream(),set2.stream()).collect(Collectors.toSet());
        set.forEach(d->System.out.println(d.getBookName()+" - - -"+d.getPrice()));

    }
}
