package com.home.function;

import java.util.Map;

public class Utility
{
    static void updateData(Map<Integer, String> persons) {
        persons.replaceAll((k, v) -> "Shree ".concat(v));
    }

    static void displayData(Map<Integer, String> persons) {
        for (Map.Entry<Integer, String> entry : persons.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
