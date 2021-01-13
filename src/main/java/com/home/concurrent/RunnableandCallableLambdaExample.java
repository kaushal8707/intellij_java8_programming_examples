package com.home.concurrent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Consumer;

public class RunnableandCallableLambdaExample
{
    public static void main(String[] args)
    {
        final List<Book> list =  Arrays.asList(new Book(1, "Ramayana"), new Book(2, "Mahabharata"));
        Runnable r1 = () -> list.forEach(Book::print);
        Thread th1 = new Thread(r1);
        th1.start();
        Runnable r2 = () -> {
            Consumer<Book> style = (Book b) -> System.out.println("Book Id:"+b.getId() + ", Book Name:"+b.getName());
            list.forEach(style);
        };
        Thread th2 = new Thread(r2);
        th2.start();


        //sample code to run the Runnable instance using ExecutorService.
        final List<Book> list1 =  Arrays.asList(new Book(1, "Ramayan"), new Book(2, "Mahabharat"));
        ExecutorService service =  Executors.newFixedThreadPool(2);
        Runnable r3 = () -> list1.forEach(Book::print);
        service.execute(r3);
        Runnable r4 = () -> {
            Consumer<Book> style = (Book b) -> System.out.println("Book Id:"+b.getId() + ", Book Name:"+b.getName());
            list.forEach(style);
        };
        service.execute(r4);


        //Java 8 Callable Lambda Example with Argument
        final List<Integer> integers =  Arrays.asList(1,2,3,4,5);
        Callable<Integer> callableObj = () -> {
            int result = integers.stream().mapToInt(i -> i.intValue()).sum();
            return result;
        };
        ExecutorService service1 =  Executors.newSingleThreadExecutor();
        Future<Integer> future = service1.submit(callableObj);
        Integer result=0;
        try {
            result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Sum = "+result);
    }
}
