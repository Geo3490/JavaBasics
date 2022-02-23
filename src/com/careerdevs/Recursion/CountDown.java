package com.careerdevs.Recursion;

public class CountDown {

    public static void main(String[] args) {
        int testInt = 5;

        System.out.println("ITERATIVE");
        iterative(testInt);
        System.out.println("RECURSIVE");
        recursive(testInt);
    }

    //A RECURSIVE METHOD IS ONE THAT CALLS ITSELF


    private static void iterative(int countDownFrom) {
        //option1
//        if (countDownFrom > 0) {
//            System.out.println(countDownFrom);
//            --countDownFrom;
//            recursive(countDownFrom);
//        }

        //option2
//        if (countDownFrom > 0){
//            System.out.println(countDownFrom--);
//            recursive(countDownFrom);
//        }
//    }
//    private static void iterative (int countDownFrom){
//
    }
}
