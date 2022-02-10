package com.careerdevs;

public class Recursion {

    private static void countDown(int count){

        System.out.println(count);

        if (count > 0){

            countDown(--count);

        }
    }
}
