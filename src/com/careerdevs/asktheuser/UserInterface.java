package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's Your Name ? ");
        String name = scanner.nextLine();

        System.out.println("Welcome"+ " " +name+"!"+"\n");

        System.out.println("What's Your Age ? ");
        byte age = scanner.nextByte();

        System.out.println(name+" "+ "Is"+" "+age+"!"+"\n");

        System.out.println("What's Your dogs age ? ");
        short dogsAge = scanner.nextShort();

        System.out.println("Your dogs age is"+ " " +dogsAge+"!"+ " "+name +" "+"Is the owner."+"\n");

        System.out.println("Guess how many cities exist in the world ? ");
        long cityGuess = scanner.nextLong();

        System.out.println(name+ " " +"Guessed"+" "+cityGuess+ " "+"!"+"\n");

        System.out.println("What's a penny short of $20.00 final price ? ");
        float floatQuestion = scanner.nextFloat();

        System.out.println(floatQuestion+"!"+"\n");

        System.out.println("How much would it cost to buy the empire state building, exact dollars and cents guess? ");
        double doubleQuestion = scanner.nextDouble();

        System.out.println(doubleQuestion+"!"+"\n");
//
//        System.out.println("Whats Your Name ? ");
//        int intQuestion = scanner.nextInt();
//
//        System.out.println("Welcome"+ " " +name+"!"+"\n");
//
//        System.out.println("Whats Your Name ? ");
//        boolean booleanQuestion = scanner.nextBoolean();
//
//        System.out.println("Welcome"+ " " +name+"!"+"\n");
//


    }
}
