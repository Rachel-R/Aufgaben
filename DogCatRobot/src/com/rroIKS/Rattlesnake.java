package com.rroIKS;

public class Rattlesnake extends Reptile implements ICanMoveOnLand, IGivesBirthToLiveYoung,ICanSwim,IIsVenomous {

    Rattlesnake(String designation){
        super(designation);
    }

    Rattlesnake(String designation, String color){
        super(designation, color);
    }

    @Override
    public String makeSound() {
        return "Hiss (Rattlesnake)";
    }

    @Override
    public double getMoveSpeedInMPS() {
        return 0;
    }

    @Override
    public double getSwimSpeedInMPS() {
        return 0;
    }

    @Override
    public double getNumberOfOffspringPerYear() {
        return 0;
    }
}
