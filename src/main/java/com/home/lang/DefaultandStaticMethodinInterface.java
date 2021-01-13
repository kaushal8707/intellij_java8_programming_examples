package com.home.lang;

public class DefaultandStaticMethodinInterface
{
    public static void main(String[] args) {

        //Scenario One: Default Method in Interface
        Location lo = new Location();
        System.out.println(lo.getBusinessType());

        //Scenario Two: Static Method in Interface
        //Now we can write static method in interface too. In our Village interface, I have declared
        //getVillageId() as an static method. This static method can be accessed in default method as well.
        Location loc = new Location();
        System.out.println(loc.getBusinessType());
        System.out.println("Village id:"+Village.getVillageId());
        System.out.println("Location Id:"+loc.getLocationId());

        //Scenario Three: Multiple Inheritance- Default Method with Same Name in Two Interfaces
        Location locn = new Location();
        System.out.println(locn.getBusinessType());
        System.out.println("Village id:"+Village.getVillageId());
        System.out.println("Location Id:"+locn.getLocationId());


    }
}
