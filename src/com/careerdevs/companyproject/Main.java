package com.careerdevs.companyproject;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the companies name ? ");
        String companyName = scanner.nextLine();

        System.out.println("What year is company established ? ");
        short yearEstablished = scanner.nextShort();

        System.out.println("What is market cap ? ");
        double marketCap = scanner.nextDouble();

        Company customCompany = new Company(companyName, yearEstablished, marketCap);

        System.out.println(customCompany);

    }

}
