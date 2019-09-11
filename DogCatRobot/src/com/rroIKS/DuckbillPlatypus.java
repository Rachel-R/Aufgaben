package com.rroIKS;

public class DuckbillPlatypus extends Mammal implements ILaysEggs,IIsVenomous {

    DuckbillPlatypus(String designation){
        super(designation);
    }

    DuckbillPlatypus(String designation, String color){
        super(designation, color);
    }

    @Override
    public double getAverageNumberOfEggsPerYear() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Growl (Platypus)";
    }
}
