package com.rroIKS;

public class Scorpion extends Arthropod implements IGivesBirthToLiveYoung,IIsVenomous{
    Scorpion(String designation){
        super(designation);
    }

    Scorpion(String designation, String color){
        super(designation, color);
    }

    @Override
    public String makeSound() {
        return "Hiss (Scorpion)";
    }

    @Override
    public double getNumberOfOffspringPerYear() {
        return 0;
    }
}
