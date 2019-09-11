package com.rroIKS;

public class Cat extends Mammal implements IGivesBirthToLiveYoung,ICanMoveOnLand,ICanSwim {

    Cat(String designation){
        super(designation);
    }

    Cat(String designation, String color){
        super(designation, color);
    }


    public String move() {
        return "I'm moving around.";
    }

    public String makeSound() {
        return "Meow.";
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
