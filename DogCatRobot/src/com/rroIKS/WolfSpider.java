package com.rroIKS;

public class WolfSpider extends Arthropod implements ICanBreatheAir {

    WolfSpider(String designation){
        super(designation);
    }

    WolfSpider(String designation, String color){
        super(designation, color);
    }

    @Override
    public String makeSound() {
        return "Purr (Wolf Spider)";
    }

}
