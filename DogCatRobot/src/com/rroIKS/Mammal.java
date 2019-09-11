package com.rroIKS;

class Mammal extends Animal implements IHasFur, IHasWarmBlood, ICanBreatheAir {

    private String furColor = "black";

    public Mammal(String designation, String furColor) {
        super(designation);
        this.furColor = furColor;
    }

    public Mammal(String designation) {
        super(designation);
    }

    @Override
    public String getFurColor() {

        return furColor;
    }

    public void setFurColor(String furColor) {

        this.furColor = furColor;
    }
}
