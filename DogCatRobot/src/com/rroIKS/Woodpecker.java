package com.rroIKS;

public class Woodpecker extends Bird implements ICanFly {

    Woodpecker(String designation){
        super(designation);
    }

    Woodpecker(String designation, String color){
        super(designation, color);
    }

    @Override
    public String makeSound() {
        return "Chirp";
    }

    @Override
    public double getFlyingSpeedInMPS() {
        return 0;
    }
}
