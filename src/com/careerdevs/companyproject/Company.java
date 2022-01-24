package com.careerdevs.companyproject;

public class Company{
    String companyName;
    short yearEstablished;
    double marketCap;


    public Company(String companyName, short yearEstablished, double marketCap){
        this.companyName = companyName;
        this.yearEstablished = yearEstablished;
        this.marketCap = marketCap;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", yearEstablished=" + yearEstablished +
                ", marketCap=" + marketCap +
                '}';
    }
}