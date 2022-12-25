package Lesson8.HomeWork.easy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> List = new ArrayList<>();

        for (int i=0;i<10; i++) {
            List.add(i);
        }
        List.add(8,12);
        System.out.println(List);

        System.out.println(List.get(0));
        System.out.println(List.get(8));

    }
}