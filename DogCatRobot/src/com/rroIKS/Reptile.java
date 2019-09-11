package com.rroIKS;

public class Reptile extends Animal implements IHasColdBlood, IHasScales, ICanBreatheAir {

    private String scalesColor;

    public Reptile(String designation, String color) {
        super(designation);
        this.scalesColor = color;
    }

    public Reptile(String designation) {
        super(designation);
    }

    public void setScalesColor(String scalesColor) {
        this.scalesColor = scalesColor;
    }

    @Override
    public double getMinimumBodyTemp() {
        return 0;
    }

    @Override
    public String getScalesColor() {
        return scalesColor;
    }
}
