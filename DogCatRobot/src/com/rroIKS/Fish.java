package com.rroIKS;

public class Fish extends Animal implements ICanBreatheWater, IHasScales, ILaysEggs, ICanSwim {

    private String scalesColor;

    public Fish(String designation, String color) {
        super(designation);
        this.scalesColor = color;
    }

    public Fish(String designation) {
        super(designation);
    }

    void setScalesColor(String scalesColor) {
        this.scalesColor = scalesColor;
    }

    @Override
    public double getSwimSpeedInMPS() {
        return 0;
    }

    @Override
    public String getScalesColor() {

        return scalesColor;
    }

    @Override
    public double getAverageNumberOfEggsPerYear() {
        return 0;
    }

    @Override
    public String move() {
        return "I swim.";
    }

    @Override
    public String makeSound() {
        return "Blub.";
    }
}
