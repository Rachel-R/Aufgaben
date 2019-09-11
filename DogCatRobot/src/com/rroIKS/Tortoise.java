package com.rroIKS;

public class Tortoise extends Reptile implements ILaysEggs,ICanMoveOnLand {

    Tortoise(String designation){
        super(designation);
    }

    Tortoise (String designation, String color){
        super(designation, color);
    }

    @Override
    public String makeSound() {
        return "Cluck (Tortoise)";
    }

    @Override
    public double getMoveSpeedInMPS() {
        return 0;
    }

    @Override
    public double getAverageNumberOfEggsPerYear() {
        return 0;
    }
}
