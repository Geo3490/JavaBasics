package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        System.out.println("Please Enter Your name Below: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Welcome" + " " + name +"!");

    }
}

