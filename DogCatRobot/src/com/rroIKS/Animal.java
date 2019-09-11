package com.rroIKS;

class Animal implements IPoop, IMove, IMakeSound {

    private String designation;

    public Animal(){}

    public Animal(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    //3c
    @Override
    public String poop() {
        return "I'm pooping.";
    }

    @Override
    public String move() {
        return "I'm moving.";
    }

    @Override
    public String makeSound() {
        return "I'm making a Sound";
    }
}
