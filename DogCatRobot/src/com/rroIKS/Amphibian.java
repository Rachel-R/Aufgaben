package com.rroIKS;

public class Amphibian extends Animal implements ICanBreatheWater, ICanBreatheAir, IHasColdBlood, ILaysEggs {

    private String mucousSkinColor;

    public Amphibian(String designation, String color) {
        super(designation);
        this.mucousSkinColor = color;
    }

    public Amphibian(String designation) {
        super(designation);
    }

    public String getMucousSkinColor() {
        return mucousSkinColor;
    }

    public void setMucousSkinColor(String mucousSkinColor) {
        this.mucousSkinColor = mucousSkinColor;
    }

    @Override
    public double getMinimumBodyTemp() {
        return 0;
    }

    @Override
    public double getAverageNumberOfEggsPerYear() {
        return 0;
    }
}
