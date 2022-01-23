package com.careerdevs.companyproject;

public class Company {
    public String companyName;
    public short yearEstablished;
    public double marketCap;

    public void Company(){
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
