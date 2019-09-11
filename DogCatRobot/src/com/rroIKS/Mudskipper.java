package com.rroIKS;

public class Mudskipper extends Fish implements ICanMoveOnLand {

    Mudskipper(String designation) {
        super(designation);
    }

    Mudskipper(String designation, String color) {
        super(designation, color);
    }

    @Override
    public String makeSound() {
        return "Squish Blub";
    }

    @Override
    public double getMoveSpeedInMPS() {
        return 0;
    }
}
