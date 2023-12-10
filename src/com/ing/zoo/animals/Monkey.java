package com.ing.zoo.animals;

import com.ing.zoo.character.Herbivore;
import com.ing.zoo.character.Trick;

public class Monkey extends Animal implements Herbivore, Trick {
    private String trick;

    public Monkey(String name, String helloText, String eatText, String trick) {
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
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        System.out.println(trick);
    }
}
