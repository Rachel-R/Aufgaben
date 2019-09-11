package com.rroIKS;

public class Dog extends Mammal implements IGivesBirthToLiveYoung,ICanMoveOnLand,ICanSwim {
    Dog(String designation){
        super(designation);
    }

    Dog(String designation, String color) {
        super(designation, color);
    }

    public String poop() {
        return "Bad dog pooped.";
    }

    public String move() {
        return "I'm moving around.";
    }

    public String makeSound() {
        return "Wuff.";
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
