package com.rroIKS;

public class Puffin extends Bird implements ICanSwim,ICanFly,ICanMoveOnLand {

    Puffin(String designation){
        super(designation);
    }

    Puffin(String designation, String color){
        super(designation, color);
    }

    @Override
    public String makeSound() {
        return "Growl (Puffin)";
    }

    @Override
    public double getFlyingSpeedInMPS() {
        return 0;
    }

    @Override
    public double getSwimSpeedInMPS() {
        return 0;
    }

    @Override
    public double getMoveSpeedInMPS() {
        return 5;
    }
}
