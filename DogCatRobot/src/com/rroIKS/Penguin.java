package com.rroIKS;

public class Penguin extends Bird implements ICanSwim,ICanMoveOnLand {

    Penguin(String designation){
        super(designation);
    }

    Penguin(String designation, String color){
        super(designation, color);
    }

    @Override
    public String makeSound() {
        return "Gak";
    }

    @Override
    public double getSwimSpeedInMPS() {
        return 2.23;
    }

    @Override
    public double getMoveSpeedInMPS() {
        return 0;
    }
}
