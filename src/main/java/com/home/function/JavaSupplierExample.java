package com.home.function;

import java.util.Random;
import java.util.function.Supplier;

public class JavaSupplierExample
{
    public static void main(String[] args) {

        // Instantiate Supplier using Lambda Expression
        Supplier<String> s1=()->"Hello World !";
        System.out.println(s1.get());

        Random random=new Random();
        Supplier<Integer> s2=()->random.nextInt(10);
        System.out.println(s2.get());

        //Instantiate Supplier using Method Reference
        Supplier<String> s3=MyUtil::getFavoriteBook;
        System.out.println(s3.get());

        MyUtil myUtil=new MyUtil();
        Supplier<Integer> s4=myUtil::getAge;
        System.out.println(s4.get());

        Random r=new Random();
        Supplier<Integer> s5=r::nextInt;
        System.out.println(s5.get());


        //Instantiate Supplier using Default Constructor

        Supplier<Random> s6 = Random::new;
        Random rm = s6.get();
        System.out.println(rm.nextInt(10));

        Supplier<Book> s7 = Book::new;
        Book book = s7.get();
        System.out.println(book.getBookName());





    }
}
