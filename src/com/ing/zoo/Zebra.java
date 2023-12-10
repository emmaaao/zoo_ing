package com.ing.zoo;

import com.ing.zoo.character.Herbivore;
import com.ing.zoo.character.Trick;

import java.util.Random;

public class Zebra extends Animal implements Herbivore, Trick {
    public String trick;

    public Zebra(String name, String helloText, String eatText, String trick) {
        super(name, helloText, eatText);
        this.trick = trick;
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps over river";
        } else {
            trick = "grazing on grass";
        }
        System.out.println(trick);
    }
}
