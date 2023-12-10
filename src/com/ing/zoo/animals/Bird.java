package com.ing.zoo.animals;

import com.ing.zoo.character.Carnivore;
import com.ing.zoo.character.Herbivore;
import com.ing.zoo.character.Trick;

import java.util.Random;

public class Bird extends Animal implements Carnivore, Herbivore, Trick {
    private String trick;

    public Bird(String name, String helloText, String eatText, String trick) {
        super(name, helloText, eatText);
        this.trick = trick;
    }

    @Override
    public void sayHello()
    {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "krtri ktirt";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "slurp slurpp";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "flies high in the sky";
        } else {
            trick = "flies through a hoop";
        }
        System.out.println(trick);

    }
}