package com.rroIKS;

public class Bird extends Animal implements IHasFeathers, IHasWarmBlood, ILaysEggs {

    private String featherColor;

    public Bird(String designation, String color) {
        super(designation);
        this.featherColor = color;
    }

    public Bird(String designation) {
        super(designation);
    }

    public void setFeatherColor(String s) {
        featherColor = s;
    }

    @Override
    public String getFeatherColor() {
        return featherColor;
    }

    @Override
    public double getAverageNumberOfEggsPerYear() {
        return 0;
    }
}
