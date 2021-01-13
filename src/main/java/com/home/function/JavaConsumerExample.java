package com.home.function;
import java.util.*;
import java.util.function.Consumer;

public class JavaConsumerExample
{
    public static void main(String[] args) {

        //Functional Method: accept
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("kaushal");

        //We will create two Consumer here in our example using lambda expression.
        //One for adding number to list, if number is odd then we will add into a list with odd numbers and
        // if number is even then we will add it into another list with even numbers.
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        Consumer<Integer> storeData = n -> {
            if (n % 2 == 0) {
                evenList.add(n);
            } else {
                oddList.add(n);
            }
        };
        Consumer<List<Integer>> printData = list -> list.forEach(e -> System.out.println(e));
        storeData.accept(10);
        storeData.accept(15);
        storeData.accept(25);
        storeData.accept(30);

        System.out.println(" o d d - d a t a ");
        printData.accept(oddList);
        System.out.println(" e v e n - d a t a ");
        printData.accept(evenList);

        //------------------------Creating a Consumer using lambda expression----------------------
        //Example-2: We will create a Consumer using lambda expression that will decide and display data
        // for a citizen whether that person can vote or not in election.

        Consumer<Citizen> electionConsumer = c -> {
            if (c.getAge() < 18) {
                System.out.println(c.getName() + " is not eligible to vote.");
            } else {
                System.out.println(c.getName() + " can vote.");
            }
        };

        electionConsumer.accept(new Citizen("Ritesh", 15));
        electionConsumer.accept(new Citizen("Shreya", 20));


        //------------------Creating Consumer with Method Reference----------------------
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(123, "kaushal");
        map.put(456, "kanishk");

        Consumer<Map<Integer, String>> updateMap = UtilityDemo::updatedata;
        Consumer<Map<Integer, String>> displayMap = UtilityDemo::displaydata;

        updateMap.accept(map);
        displayMap.accept(map);


        //----------------------------Using andThen Method -------------------------------
        List<Integer> list= Arrays.asList(5,1,8,2,9,3,6,4);

        Consumer<List<Integer>> printEven=MyNumber::evenList;
        Consumer<List<Integer>> printOdd=MyNumber::oddList;
        Consumer<List<Integer>> statusPrint=MyNumber::statusPrint;

        printEven.andThen(printOdd).andThen(statusPrint).accept(list);




    }
}
