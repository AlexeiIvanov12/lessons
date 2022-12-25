package lesson9;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
//        Map<String,String> contacts = new TreeMap<>();
//
//        contacts.put("Bob", "+79281231211");
//        contacts.put("Alex", "+79233456677");
//        contacts.put("Tom", "+79233457788");
//        contacts.put("Bob", "PING");
//
//        System.out.println(contacts);
//        System.out.println(contacts.get("Bob"));
//
//        Set<String> keys = contacts.keySet();
//
//            System.out.println(keys +" ");
//
//            Set<Map.Entry<String, String>> entries = contacts.entrySet();
//            for (Map.Entry<String, String> entry : entries) {
//                System.out.println("Key is "+ entry.getKey()+ " value is " +entry.getValue());
//            }



        Set<String> contacts = new TreeSet<>();

        contacts.add("Bob");
        contacts.add("Tom");
        contacts.add("Alex");


        System.out.println(contacts);
    }
}
