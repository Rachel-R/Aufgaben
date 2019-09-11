package com.rroIKS;

public class MurderRobotDog extends MurderRobot implements IMakeSound {

    public String kill(){
        return "Robodog is Killing";
    }
    @Override
    public String makeSound() {
        return "Robotic Wuff";
    }
}
