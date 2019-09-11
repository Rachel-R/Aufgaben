package com.rroIKS;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1
        Dog rover = new Dog("Rover, the dog");
        Dog killer = new Dog("Killer, the dog");
        System.out.println("Rover says: " + rover.makeSound());
        System.out.println("Killer says: " + killer.makeSound());
        //2
        Cat greebo = new Cat("Greebo, the cat");
        Cat salem = new Cat("Salem, the cat");
        System.out.println("Greebo says: " + greebo.makeSound());
        System.out.println("Salem says: " + salem.makeSound());
        //3
        System.out.println("Rover says: " + rover.poop());
        System.out.println("Killer says: " + killer.poop());
        System.out.println("Greebo says: " + greebo.poop());
        System.out.println("Salem says: " + salem.poop());
        //4
        CleaningRobot clyde = new CleaningRobot();
        System.out.println("Clyde says: " + clyde.move());
        System.out.println("Clyde says: " + clyde.clean());
        //5
        MurderRobot hal = new MurderRobot();
        System.out.println("Hal says: " + hal.move());
        System.out.println("Hal says: " + hal.kill());
        //6
        MurderRobotDog fido3000 = new MurderRobotDog();
        System.out.println("Fido3000 says: " + fido3000.move());
        System.out.println("Fido3000 says: " + fido3000.kill());
        System.out.println("Fido3000 says: " + fido3000.makeSound());
        //9
        System.out.println("Rover says: My fur is " + rover.getFurColor());
        System.out.println("Killer says: My fur is " + killer.getFurColor());
        System.out.println("Greebo says: My fur is " + greebo.getFurColor());
        System.out.println("Salem says: My fur is " + salem.getFurColor());
        //11
        Cat princess = new Cat("Princess, the cat", "Pink");
        Cat maya = new Cat("Maya, the cat");
        System.out.println("Princess says: My fur is " + princess.getFurColor());
        System.out.println("Maya says: My fur is " + maya.getFurColor());
        //12
        DuckbillPlatypus perry = new DuckbillPlatypus("Perry, the duckbill platypus");
        DuckbillPlatypus donna = new DuckbillPlatypus("Donna, the duckbill platypus", "beige");
        Frog freddy = new Frog("Freddy, the frog");
        Frog franny = new Frog("Franny, the frog", "red");
        Mudskipper mickey = new Mudskipper("Mickey, the mudskipper");
        Mudskipper melinda = new Mudskipper("Melinda, the mudskipper", "white");
        Penguin patrick = new Penguin("Patrick, the penguin");
        Penguin paola = new Penguin("Paola, the penguin", "purple");
        Pitohui pablo = new Pitohui("Pablo, the pitohui");
        Pitohui paloma = new Pitohui("Paloma, the pitohui", "turquoise");
        Puffin pete = new Puffin("Pete, the puffin");
        Puffin penny = new Puffin("Penny, the puffin", "yellow");
        Rattlesnake randy = new Rattlesnake("Randy, the rattlesnake");
        Rattlesnake rhonda = new Rattlesnake("Rhonda, the rattlesnake", "green");
        Scorpion sergio = new Scorpion("Sergio, the scorpion");
        Scorpion serafina = new Scorpion("Serafina, the scorpion", "magenta");
        Tortoise timothy = new Tortoise("Timothy, the tortoise");
        Tortoise tina = new Tortoise("Tina, the tortoise", " grey");
        Turtle thomas = new Turtle("Thomas, the turtle");
        Turtle trudy = new Turtle("Trudy, the turtle", "golden");
        WolfSpider warren = new WolfSpider("Warren, the wolfspider");
        WolfSpider winnie = new WolfSpider("Winnie, the wolfspider", "onyx");
        Woodpecker woody = new Woodpecker("Woody, the woodpecker");
        Woodpecker wendy = new Woodpecker("Wendy, the woodpecker", "orange");

        List<Animal> zoo = new ArrayList<>();
        zoo.add(rover);
        zoo.add(killer);
        zoo.add(greebo);
        zoo.add(salem);
        zoo.add(princess);
        zoo.add(maya);
        zoo.add(perry);
        zoo.add(donna);
        zoo.add(freddy);
        zoo.add(franny);
        zoo.add(mickey);
        zoo.add(melinda);
        zoo.add(patrick);
        zoo.add(paola);
        zoo.add(pablo);
        zoo.add(paloma);
        zoo.add(pete);
        zoo.add(penny);
        zoo.add(randy);
        zoo.add(rhonda);
        zoo.add(sergio);
        zoo.add(serafina);
        zoo.add(timothy);
        zoo.add(tina);
        zoo.add(thomas);
        zoo.add(trudy);
        zoo.add(warren);
        zoo.add(winnie);
        zoo.add(woody);
        zoo.add(wendy);

        for (Animal animal : zoo) {
            if (animal instanceof IHasExoskeleton) {
                System.out.println(animal.getDesignation() + " says: My exoskeleton is " + ((IHasExoskeleton) animal).getExoskeletonColor());
            } else if (animal instanceof IHasFeathers) {
                System.out.println(animal.getDesignation() + " says: My plumage is " + ((IHasFeathers) animal).getFeatherColor());
            } else if (animal instanceof IHasFur) {
                System.out.println(animal.getDesignation() + " says: My fur is " + ((IHasFur) animal).getFurColor());
            } else if (animal instanceof IHasMucousSkin) {
                System.out.println(animal.getDesignation() + " says: My mucous skin is " + ((IHasMucousSkin) animal).getMucousSkinColor());
            } else if (animal instanceof IHasScales) {
                System.out.println(animal.getDesignation() + " says: My scales are " + ((IHasScales) animal).getScalesColor());
            }
            System.out.println(animal.poop());
            System.out.println(animal.makeSound());
        }
        System.out.println("\n");

        for (Animal animal : zoo) {
            if (animal instanceof IIsVenomous)
                System.out.println(animal.getDesignation() + " says: My species is venomous!");
        }
        System.out.println("\n");

        for (Animal animal : zoo) {
            if (animal instanceof IGivesBirthToLiveYoung)
                System.out.println(animal.getDesignation() + " says: My species gives birth to live young!");
        }
    }
}