package com.ing.zoo.animals;

import com.ing.zoo.character.Carnivore;
import com.ing.zoo.character.Trick;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, Trick {
    public String trick;

    public Tiger(String name, String helloText, String eatText, String trick) {
        super(name, helloText, eatText);
        this.trick = trick;
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
