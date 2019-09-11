package com.rroIKS;

public class Frog extends Amphibian implements IHasMucousSkin {

    Frog(String designation) {
        super(designation);
    }

    Frog(String designation, String color) {
        super(designation, color);
    }

    @Override
    public String makeSound() {
        return "Ribbit";
    }

}

