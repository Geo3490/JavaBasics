package com.careerdevs;


public class Main{

    public static void main(String[] args) {

        Car myCar = new Car("Camarro2SS", "Chevy", 10000, 10);

        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getMileage());
        System.out.println(myCar.getGas());


    }
}
