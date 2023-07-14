package com.citibank.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArraysListMain {

    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("1. Integer ArrayList");
        for (int i = 0; i < 10; i++) {
                arrayList.add(i);
        }  

        System.out.println(arrayList);

        for (Integer integer : arrayList) {
            System.out.print(integer + ",");   
        }
        System.out.println("\n");


        List <String> list = new ArrayList<String>();
        System.out.println("2. String array list");
        for (int i = 0; i < 10; i++) {
                list.add(String.valueOf(i));
        }
        System.out.println(list);

        Set<Integer> set = new HashSet<Integer>();
        System.out.println("2 Set Collection..");
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(100);

        System.out.println(set);

        Set<Integer> set2 = new TreeSet<Integer>();
        set2.add(10);
        set2.add(30);
        set2.add(20);
        set2.add(05);

        System.out.println(set2);

        for (Integer integer : set2) {
            if(set2.add(10)){
                System.out.println("found " + integer);
            } else {
                System.out.println("10 not found..");
                break;
            }
        }

        Map<Integer, String> map = new HashMap<Integer, String>();
        System.out.println("3. Integer to String Map");

        for (int i = 0; i < 10; i++) {
                map.put(i, String.valueOf(i));
        }
        System.out.println(map);
    }   
}
