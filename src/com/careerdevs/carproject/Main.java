package com.careerdevs.carproject;


import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

System.out.println();
        Scanner scanner = new Scanner(System.in);

        Car myCarOne = new Car("Camarro2SS", "Chevy", 10_000, 0.10F);

        Car myCarTwo = new Car("Mustang", "Ford", 30_000, 0.50F);

        Car myCarThree = new Car("Hellcat", "Dodge", 100, 0.90F);
//
////
////            //STANDARD SOLUTION
        System.out.println("MAKE: "+ myCarOne.getMake()+","+" "+ "MODEL: " + myCarOne.getModel()+","+" "+ "MILEAGE: " + myCarOne.getMileage()+","+" "+ "GAS: "+ myCarOne.getGas());
        System.out.println("MAKE: "+ myCarTwo.getMake()+","+" "+ "MODEL: " + myCarTwo.getModel()+","+" "+ "MILEAGE: " + myCarTwo.getMileage()+","+" "+ "GAS: "+ myCarTwo.getGas());
        System.out.println("MAKE: "+ myCarThree.getMake()+","+" "+ "MODEL: " + myCarThree.getModel()+","+" "+ "MILEAGE: " + myCarThree.getMileage()+","+" "+ "GAS: "+ myCarThree.getGas());

//
//        //BONUS Solution ARRAY
//        Car[] myCar = new Car[3];
//        myCar[0] = myCarOne;
//        myCar[1] = myCarTwo;
//        myCar[2] = myCarThree;
//
//        Car[] myNewCar = new Car []{myCarOne, myCarTwo, myCarThree};
//        ArrayList<Car> carArrayList = new ArrayList<>();
//
//        carArrayList.add(myCarOne);
//        carArrayList.add(myCarTwo);
//        carArrayList.add(myCarThree);
//
//    }
}}
