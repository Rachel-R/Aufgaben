package com.rroIKS;

public class Arthropod extends Animal implements IHasExoskeleton, IHasColdBlood, IHasMoreThanFourLegs {

    private String exoskeletonColor;

    public Arthropod(String designation, String color) {
        super(designation);
        this.exoskeletonColor = color;
    }

    public Arthropod(String designation) {
        super(designation);
    }

    @Override
    public double getMinimumBodyTemp() {
        return 0;
    }

    @Override
    public String getExoskeletonColor() {
        return exoskeletonColor;
    }

    @Override
    public int getNumberOfLegs() {
        return 0;
    }

    void setExoskeletonColor(String exoskeletonColor) {
        this.exoskeletonColor = exoskeletonColor;
    }
}
