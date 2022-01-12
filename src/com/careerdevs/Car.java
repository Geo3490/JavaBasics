package com.careerdevs;

public class Car {

    //FIELDS
    private String make;
    private String model;
    private int mileage;
    private float gas;

    //CONSTRUCTOR
    public Car(String make, String model, int mileage, float gas) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gas = gas;
    }

    public String getMake() {
        return make;
    }

        public void setName (String make){
            this.make = make;

        }
        public String getModel () {
            return model;
        }


        public void setModel (String model){
            this.model = model;
        }

        public int getMileage () {
            return mileage;
        }

        public void getMileage ( int mileage){
            this.mileage = 1000;
        }

        public float getGas () {
            return gas;
        }
    public void setGas(float gas) {
        this.gas = 10;

    }
}