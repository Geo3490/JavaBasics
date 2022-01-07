package com.careerdevs;

//import java.util.Arrays;

//public class Main {
//    public static void main (String[] args) {
//        String fullName = new String("Hello");
//        System.out.println(fullName.length());
//        System.out.println(fullName.toLowerCase());
//        System.out.println(fullName.concat(" " + "My Name Is George"));
//        System.out.println(fullName + " "+ "My Name Is George");
//        byte [][] fullNameNew = {{34},{44}};
//
////        System.out.println();
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name:");
        String name = scanner.nextLine();
        System.out.print("Age:");
        Byte age = scanner.nextByte();
        System.out.println("Welcome"+ " " + name + " " + "Your Age is" + " " + age);
    }
}