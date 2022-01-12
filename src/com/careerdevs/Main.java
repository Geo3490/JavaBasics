package com.careerdevs;


public class Main{

    public static void main(String[] args) {

        Car myCar = new Car("Camarro2SS", "Chevy", 10000, 10);
        System.out.println("Make: "+ myCar.getMake()+","+" "+ "Model: " + myCar.getModel()+","+" "+ "Mileage: " + myCar.getMileage()+","+" "+ "Gas: "+ myCar.getGas());
//        System.out.println("Model: "+ myCar.getModel());
//        System.out.println("Mileage: "+ myCar.getMileage());
//        System.out.println("Gas: "+ myCar.getGas());

//        Make: Mustang GT Model: Ford, mileage: 30000, gasTankPercent: 0.50
//
//        Make: Hellcat, Model: Dodge, mileage: 100, gasTankPercent: 0.90
    }
}
