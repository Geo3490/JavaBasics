package com.careerdevs.hashmappractice;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> empId = new HashMap<>();
        empId.put("Jack", 250);

//        System.out.println(empId);
      System.out.println(empId.containsKey("Jack"));


    }
}
