package com.careerdevs;

public class Main {
    public static void main (String[] args){
        String firstName = "George";
        String lastName = "Elefsiades";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);

    }
    public static String createFullName(String fName, String lName){
        return fName + lName;
    }
}