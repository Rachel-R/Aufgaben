package com.rroIKS;

public class Pitohui extends Bird implements ICanFly, IIsVenomous {

    Pitohui(String designation){
        super(designation);
    }

    Pitohui(String designation, String color){
        super(designation, color);
    }

    @Override
    public String makeSound() {
        return "Chirp (Pitohui)";
    }

    @Override
    public double getFlyingSpeedInMPS() {
        return 0;
    }

}
