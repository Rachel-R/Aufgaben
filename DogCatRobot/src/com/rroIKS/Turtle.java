package com.rroIKS;

public class Turtle extends Reptile implements ILaysEggs,ICanSwim,ICanMoveOnLand {

    Turtle(String designation){
        super(designation);
    }

    Turtle(String designation, String color){
        super(designation, color);
    }

    @Override
    public String makeSound() {
        return "Hiss (Turtle)";
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
    public double getAverageNumberOfEggsPerYear() {
        return 0;
    }
}
